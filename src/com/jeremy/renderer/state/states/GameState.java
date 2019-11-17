package com.jeremy.renderer.state.states;

import com.jeremy.renderer.entity.Entity;
import com.jeremy.renderer.entity.entities.creatures.Player;
import com.jeremy.renderer.graphics.shader.ShaderProgram;
import com.jeremy.renderer.state.State;
import com.jeremy.renderer.world.World;

public class GameState extends State {

	private static GameState instance = null;

	private World world;

	private GameState() {
		world = new World();
		Entity player = new Player("Jeremy");
		world.spawn(player);
	}

	public void tick() {
		world.tick();
	}

	public void render(ShaderProgram shaderProgram) {
		world.render(shaderProgram);
	}
	
	public static GameState getInstance() {
		if (instance == null) {
			instance = new GameState();
		}
		return instance;
	}

}
