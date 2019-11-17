package com.jeremy.renderer.graphics.data;

import static org.lwjgl.opengl.GL11.*;

import com.jeremy.renderer.graphics.shader.ShaderProgram;

import math.matrix.mat4.Matrix4;

public class Model {

	private VAO vao;
	private VBO ibo;
	private Texture texture;
	private float dampening = 10f;
	private float reflectivity = 0.4f;

	private float xOffset, yOffset, zOffset;
	private float yaw, pitch, roll;
	private float scale;

	private Matrix4 transformationMatrix;

	public Model(Texture texture, float[] vertices, int[] indices, float[] normals) {
		vao = new VAO();
		VBO verticesVBO = new VBO(VBO.TYPE_ARRAY_BUFFER, 3, VBO.USEAGE_STATIC_DRAW, vertices);
		vao.store(verticesVBO, 0);

		if (texture != null) {
			this.texture = texture;
			VBO textureCoords = new VBO(VBO.TYPE_ARRAY_BUFFER, 2, VBO.USEAGE_STATIC_DRAW, texture.getTextureCoords());
			vao.store(textureCoords, 1);
		}

		VBO normalsVBO = new VBO(VBO.TYPE_ARRAY_BUFFER, 3, VBO.USEAGE_STATIC_DRAW, normals);
		vao.store(normalsVBO, 2);

		ibo = new VBO(VBO.TYPE_ELEMENT_ARRAY_BUFFER, 2, VBO.USEAGE_STATIC_DRAW, indices);
	}

	public Model(float[] vertices, int[] indices, float[] normals) {
		this(null, vertices, indices, normals);
	}

	public void render(ShaderProgram shaderProgram) {
		vao.bind();
		ibo.bind();
		if (texture != null) {
			texture.bind();
			texture.setActive();
		}

		transformationMatrix = new Matrix4();

		transformationMatrix.rotateX(pitch);
		transformationMatrix.rotateY(yaw);
		transformationMatrix.rotateZ(roll);
		transformationMatrix.translate(xOffset, yOffset, zOffset);
		transformationMatrix.scale(scale);

		shaderProgram.setUniform("transform", transformationMatrix);
		shaderProgram.setUniform("shine", dampening);
		shaderProgram.setUniform("reflectivity", reflectivity);

		glDrawElements(GL_TRIANGLES, ibo.getSize(), GL_UNSIGNED_INT, 0);

		vao.unbind();
		ibo.unbind();
		if (texture != null)
			texture.unbind();
	}

	public Model rotate(float yaw, float pitch, float roll) {
		this.yaw = yaw;
		this.pitch = pitch;
		this.roll = roll;
		return this;
	}

	public Model translate(float x, float y, float z) {
		xOffset = x;
		yOffset = y;
		zOffset = z;
		return this;
	}

	public Model scale(float scale) {
		this.scale = scale;
		return this;
	}

}
