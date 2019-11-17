package com.jeremy.renderer.graphics;

import org.lwjgl.opengl.GL11;

import com.jeremy.renderer.Game;
import com.jeremy.renderer.graphics.shader.Shader;
import com.jeremy.renderer.graphics.shader.ShaderProgram;
import com.jeremy.renderer.state.State;

import math.Glm;
import math.matrix.mat4.Matrix4;

public class Renderer {

	private Window window;
	private ShaderProgram shaderProgram;

	private Matrix4 projectionMatrix;

	public Renderer(Window window, Shader vertexShader, Shader fragmentShader) {
		this.window = window;
		shaderProgram = new ShaderProgram();
		projectionMatrix = Glm.perspectiveFov(70, Game.WIDTH, Game.HEIGHT, 0.1f, 2000f, new Matrix4());
		shaderProgram.addShader(vertexShader);
		shaderProgram.addShader(fragmentShader);
		vertexShader.delete();
		fragmentShader.delete();
		shaderProgram.validate();
		shaderProgram.use();

//		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glCullFace(GL11.GL_BACK);
	}

	public void render(State state) {
		window.clear();

		shaderProgram.setUniform("view", Camera.getView());
		shaderProgram.setUniform("projection", projectionMatrix);

		state.render(shaderProgram);

		window.swapBuffers();
	}

}
