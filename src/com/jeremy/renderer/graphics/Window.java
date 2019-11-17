package com.jeremy.renderer.graphics;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

import java.awt.Color;

import org.lwjgl.glfw.GLFWVidMode;

import com.jeremy.utilities.Logger;

public class Window {

	public static final Color BACKGROUND_COLOR = Color.decode("#000921");

	private long window;
	private String title;
	private int width;
	private int height;
	private GLFWVidMode videoMode;
	private boolean running;

	private KeyEvent keyEvent;
	private MouseEvent mouseEvent;

	public Window(String title, int width, int height, boolean resizable) {
		this.title = title;
		this.width = width;
		this.height = height;
		if (!glfwInit()) {
			Logger.error(new Exception("Failed to initialize glfw."), true);
			return;
		}
		videoMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3);
		glfwWindowHint(GLFW_OPENGL_ANY_PROFILE, GLFW_OPENGL_CORE_PROFILE);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, GL_TRUE);
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, resizable ? GL_TRUE : GL_FALSE);
	}

	public void start() {
		if (running) {
			Logger.warn("Attempted to start a window that was already running.");
			return;
		}
		window = glfwCreateWindow(width, height, title, NULL, NULL);
		if (window == NULL) {
			Logger.error("Failed to create GLFW window.");
			destroy();
			return;
		}
		glfwMakeContextCurrent(window);
		createCapabilities();
		glfwSetInputMode(window, GLFW_CURSOR, GLFW_CURSOR_DISABLED);
		glfwSetKeyCallback(window, this::onKey);
		glfwSetMouseButtonCallback(window, this::onMouseButton);
		glfwSetScrollCallback(window, this::onMouseScroll);
		glfwSetCursorPosCallback(window, this::onMouseMove);
		float red = (float) BACKGROUND_COLOR.getRed() / 255;
		float green = (float) BACKGROUND_COLOR.getGreen() / 255;
		float blue = (float) BACKGROUND_COLOR.getBlue() / 255;
		float alpha = (float) BACKGROUND_COLOR.getAlpha() / 255;
		glClearColor(red, green, blue, alpha);
		glEnable(GL_DEPTH_TEST);
		glEnable(GL_NORMALIZE);
		center();
		glfwShowWindow(window);
		running = true;
	}

	public void stop() {
		if (!running) {
			Logger.warn("Attempted to stop window that wasn't running.");
			return;
		}
		glfwDestroyWindow(window);
		glfwTerminate();
	}

	public void pollEvents() {
		glfwPollEvents();
	}

	public void setIcon(String path) throws Exception {
		// glfwSetWindowIcon(window, imagebf);
	}

	public void clear() {
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	}

	public void swapBuffers() {
		glfwSwapBuffers(window);
	}

	public boolean isValid() {
		return window != 0;
	}

	public boolean isAlive() {
		return !glfwWindowShouldClose(window);
	}

	public void setLocation(int x, int y) {
		glfwSetWindowPos(window, x, y);
	}

	public int getWidth() {
		int[] width = new int[1];
		glfwGetWindowSize(window, width, null);
		return width[0];
	}

	public int getHeight() {
		int[] height = new int[1];
		glfwGetWindowSize(window, null, height);
		return height[0];
	}

	public void center() {
		setLocation(videoMode.width() / 2 - getWidth() / 2, videoMode.height() / 2 - getHeight() / 2);
	}

	public KeyEvent getKeyEvent() {
		return keyEvent;
	}

	public void setKeyEvent(KeyEvent keyEvent) {
		this.keyEvent = keyEvent;
	}

	public MouseEvent getMouseButtonEvent() {
		return mouseEvent;
	}

	public void setMouseButtonEvent(MouseEvent mouseButtonEvent) {
		this.mouseEvent = mouseButtonEvent;
	}

	private void onKey(long window, int key, int scancode, int action, int mode) {
		if (keyEvent == null) {
			Logger.warnOnce("No key event defined for window '" + title + "' (" + window + ")");
			return;
		}
		keyEvent.keyEvent(key, scancode, action, mode);
	}

	private void onMouseButton(long window, int button, int action, int mods) {
		if (mouseEvent == null) {
			Logger.warnOnce("No mouse button event defined for window '" + title + "' (" + window + ")");
			return;
		}
		mouseEvent.buttonEvent(button, action, mods);
	}

	private void onMouseMove(long window, double x, double y) {
		if (mouseEvent == null) {
			Logger.warnOnce("No mouse button event defined for window '" + title + "' (" + window + ")");
			return;
		}
		mouseEvent.moveEvent((int) x, (int) y);
	}

	private void onMouseScroll(long window, double xOffset, double yOffset) {
		if (mouseEvent == null) {
			Logger.warnOnce("No mouse button event defined for window '" + title + "' (" + window + ")");
			return;
		}
		mouseEvent.scrollEvent((int) xOffset, (int) yOffset);
	}

	public interface KeyEvent {

		public static final int KEY_UNKNOWN = -1, KEY_SPACE = 32, KEY_APOSTROPHE = 39, KEY_COMMA = 44, KEY_MINUS = 45, KEY_PERIOD = 46,
				KEY_SLASH = 47, KEY_0 = 48, KEY_1 = 49, KEY_2 = 50, KEY_3 = 51, KEY_4 = 52, KEY_5 = 53, KEY_6 = 54, KEY_7 = 55, KEY_8 = 56,
				KEY_9 = 57, KEY_SEMICOLON = 59, KEY_EQUAL = 61, KEY_A = 65, KEY_B = 66, KEY_C = 67, KEY_D = 68, KEY_E = 69, KEY_F = 70, KEY_G = 71,
				KEY_H = 72, KEY_I = 73, KEY_J = 74, KEY_K = 75, KEY_L = 76, KEY_M = 77, KEY_N = 78, KEY_O = 79, KEY_P = 80, KEY_Q = 81, KEY_R = 82,
				KEY_S = 83, KEY_T = 84, KEY_U = 85, KEY_V = 86, KEY_W = 87, KEY_X = 88, KEY_Y = 89, KEY_Z = 90, KEY_LEFT_BRACKET = 91,
				KEY_BACKSLASH = 92, KEY_RIGHT_BRACKET = 93, KEY_GRAVE_ACCENT = 96, KEY_WORLD_1 = 161, KEY_WORLD_2 = 162, KEY_ESCAPE = 256,
				KEY_ENTER = 257, KEY_TAB = 258, KEY_BACKSPACE = 259, KEY_INSERT = 260, KEY_DELETE = 261, KEY_RIGHT = 262, KEY_LEFT = 263,
				KEY_DOWN = 264, KEY_UP = 265, KEY_PAGE_UP = 266, KEY_PAGE_DOWN = 267, KEY_HOME = 268, KEY_END = 269, KEY_CAPS_LOCK = 280,
				KEY_SCROLL_LOCK = 281, KEY_NUM_LOCK = 282, KEY_PRINT_SCREEN = 283, KEY_PAUSE = 284, KEY_F1 = 290, KEY_F2 = 291, KEY_F3 = 292,
				KEY_F4 = 293, KEY_F5 = 294, KEY_F6 = 295, KEY_F7 = 296, KEY_F8 = 297, KEY_F9 = 298, KEY_F10 = 299, KEY_F11 = 300, KEY_F12 = 301,
				KEY_F13 = 302, KEY_F14 = 303, KEY_F15 = 304, KEY_F16 = 305, KEY_F17 = 306, KEY_F18 = 307, KEY_F19 = 308, KEY_F20 = 309, KEY_F21 = 310,
				KEY_F22 = 311, KEY_F23 = 312, KEY_F24 = 313, KEY_F25 = 314, KEY_KP_0 = 320, KEY_KP_1 = 321, KEY_KP_2 = 322, KEY_KP_3 = 323,
				KEY_KP_4 = 324, KEY_KP_5 = 325, KEY_KP_6 = 326, KEY_KP_7 = 327, KEY_KP_8 = 328, KEY_KP_9 = 329, KEY_KP_DECIMAL = 330,
				KEY_KP_DIVIDE = 331, KEY_KP_MULTIPLY = 332, KEY_KP_SUBTRACT = 333, KEY_KP_ADD = 334, KEY_KP_ENTER = 335, KEY_KP_EQUAL = 336,
				KEY_LEFT_SHIFT = 340, KEY_LEFT_CONTROL = 341, KEY_LEFT_ALT = 342, KEY_LEFT_SUPER = 343, KEY_RIGHT_SHIFT = 344,
				KEY_RIGHT_CONTROL = 345, KEY_RIGHT_ALT = 346, KEY_RIGHT_SUPER = 347, KEY_MENU = 348, ACTION_RELEASE = 0, ACTION_PRESS = 1,
				ACTION_REPEAT = 2;

		public abstract void keyEvent(int key, int scancode, int action, int mode);
	}

	public interface MouseEvent {
		public static final int MOUSE_BUTTON_1 = 0, MOUSE_BUTTON_2 = 1, MOUSE_BUTTON_3 = 2, MOUSE_BUTTON_4 = 3, MOUSE_BUTTON_5 = 4,
				MOUSE_BUTTON_6 = 5, MOUSE_BUTTON_7 = 6, MOUSE_BUTTON_8 = 7, MOUSE_BUTTON_LAST = MOUSE_BUTTON_8, MOUSE_BUTTON_LEFT = MOUSE_BUTTON_1,
				MOUSE_BUTTON_RIGHT = MOUSE_BUTTON_2, MOUSE_BUTTON_MIDDLE = MOUSE_BUTTON_3, ACTION_RELEASE = 0, ACTION_PRESS = 1, ACTION_REPEAT = 2;

		public abstract void buttonEvent(int button, int action, int mods);

		public abstract void scrollEvent(int xOffset, int yOffset);

		public abstract void moveEvent(int x, int y);
	}

}
