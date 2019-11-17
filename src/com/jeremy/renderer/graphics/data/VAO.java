package com.jeremy.renderer.graphics.data;

import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL30.*;

import java.util.ArrayList;

public class VAO {

	private static ArrayList<VAO> vaos = new ArrayList<VAO>();
	private int vao;

	public VAO() {
		vao = glGenVertexArrays();
		vaos.add(this);
	}

	protected void bind() {
		glBindVertexArray(vao);
	}

	protected void unbind() {
		glBindVertexArray(0);
	}

	public void enableAttribute(int attribute) {
		bind();
		glEnableVertexAttribArray(attribute);
		unbind();
	}

	public void disableAttribute(int attribute) {
		bind();
		glDisableVertexAttribArray(attribute);
		unbind();
	}

	public void store(VBO vbo, int location) {
		bind();
		vbo.bind();
		glVertexAttribPointer(location, vbo.getComponetCount(), vbo.getDataType(), false, 0, 0);
		glEnableVertexAttribArray(location);
		unbind();
		vbo.unbind();
	}

	public void delete() {
		glDeleteVertexArrays(vao);
	}

	public static void cleanUp() {
		for (VAO vao : vaos)
			vao.delete();
	}

}
