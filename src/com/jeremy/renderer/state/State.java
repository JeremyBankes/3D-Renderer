package com.jeremy.renderer.state;

import com.jeremy.renderer.graphics.shader.ShaderProgram;

public abstract class State {
	
	private static State currentState;

	public abstract void tick();

	public abstract void render(ShaderProgram shaderProgram);
	
	public static State getCurrentState() {
		return currentState;
	}
	
	public static void setCurrentState(State currentState) {
		State.currentState = currentState;
	}
	
}
