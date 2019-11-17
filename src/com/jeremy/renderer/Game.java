package com.jeremy.renderer;

import com.jeremy.renderer.graphics.Camera;
import com.jeremy.renderer.graphics.Renderer;
import com.jeremy.renderer.graphics.Window;
import com.jeremy.renderer.graphics.Window.KeyEvent;
import com.jeremy.renderer.graphics.data.Texture;
import com.jeremy.renderer.graphics.data.VAO;
import com.jeremy.renderer.graphics.data.VBO;
import com.jeremy.renderer.graphics.shader.Shader;
import com.jeremy.renderer.input.KeyInput;
import com.jeremy.renderer.input.MouseInput;
import com.jeremy.renderer.state.State;
import com.jeremy.renderer.state.states.GameState;
import com.jeremy.utilities.Logger;

public class Game {

	public static final String NAME = "OpenGL 3D Renderer";
	public static final float VERSION = 1.0f;
	public static final int WIDTH = 1440;
	public static final int HEIGHT = 810;
	public static final int TPS = 60;

	private Window window;
	private Renderer renderer;
	private boolean running;

	public Game() {
		window = new Window(NAME + " " + VERSION, WIDTH, HEIGHT, false);
	}

	public void start() {
		if (running) {
			Logger.warn("Attempted to start a game that was already running.");
			return;
		}
		running = true;
		run();
	}

	public void stop() {
		if (!running) {
			Logger.warn("Attempted to stop a game that was not running.");
			return;
		}
		running = false;
	}

	private void run() {
		initiate();
		long last = System.nanoTime();
		long second = System.nanoTime();
		long secondAsNano = 1000000000;
		long tickTime = secondAsNano / TPS;
		long elapsed = 0;
		int frames = 0;
		int ticks = 0;
		while (running) {
			long current = System.nanoTime();
			elapsed += current - last;
			if (elapsed > tickTime) {
				elapsed -= tickTime;
				tick();
				ticks++;
			}
			render();
			frames++;
			if (current - second > secondAsNano) {
				second += secondAsNano;
				Logger.info("Timings: (TPS: ", ticks, "), (FPS: ", frames, ")");
				frames = 0;
				ticks = 0;
			}
			last = current;
		}
		terminate();
	}

	private void tick() {
		if (!window.isAlive())
			stop();
		State.getCurrentState().tick();
		MouseInput.tick();
		Camera.tick();
		window.pollEvents();
	}

	private void render() {
		renderer.render(State.getCurrentState());
	}

	private void initiate() {
		window.start();
		Shader vertexShader = new Shader("/shaders/basic.vert", Shader.VERTEX);
		Shader fragmentShader = new Shader("/shaders/basic.frag", Shader.FRAGMENT);
		renderer = new Renderer(window, vertexShader, fragmentShader);
		State.setCurrentState(GameState.getInstance());

		window.setKeyEvent((key, scancode, action, mode) -> {
			KeyInput.keyEvent(key, action);
			if (key == KeyEvent.KEY_ESCAPE) {
				stop();
			}
		});

		window.setMouseButtonEvent(new Window.MouseEvent() {
			public void moveEvent(int x, int y) {
				MouseInput.moveEvent(x, y);
			}

			public void buttonEvent(int button, int action, int mods) {
				MouseInput.buttonEvent(button, action);
			}

			public void scrollEvent(int xOffset, int yOffset) {
				MouseInput.scrollEvent(xOffset, yOffset);
			}
		});

		try {
			window.setIcon("/textures/crate.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (!window.isValid()) {
			Logger.error(new Exception("Failed to create valid window."), true);
		}
		Logger.info("Successfully initiated " + NAME + " " + VERSION);
	}

	private void terminate() {
		window.stop();
		VAO.cleanUp();
		VBO.cleanUp();
		Texture.cleanUp();
		Logger.info("Successfully terminated " + NAME + " " + VERSION);
	}

}
