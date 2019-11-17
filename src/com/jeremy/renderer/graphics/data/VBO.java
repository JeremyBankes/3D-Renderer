package com.jeremy.renderer.graphics.data;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;

import java.util.ArrayList;

public class VBO {

	public static final int TYPE_ARRAY_BUFFER = GL_ARRAY_BUFFER;
	public static final int TYPE_ELEMENT_ARRAY_BUFFER = GL_ELEMENT_ARRAY_BUFFER;
	public static final int USEAGE_STATIC_DRAW = GL_STATIC_DRAW;

	private static ArrayList<VBO> vbos = new ArrayList<VBO>();
	private int vbo;
	private int componetCount;
	private int type;
	private int dataType;
	private int size;

	public VBO(int type, int componetCount, int usage, float[] data) {
		this(type, componetCount);
		dataType = GL_FLOAT;
		size = data.length;
		bind();
		glBufferData(type, data, usage);
		unbind();
	}

	public VBO(int type, int componetCount, int usage, int[] data) {
		this(type, componetCount);
		dataType = GL_INT;
		size = data.length;
		bind();
		glBufferData(type, data, usage);
		unbind();
	}

	private VBO(int type, int componetCount) {
		this.type = type;
		this.componetCount = componetCount;
		vbo = glGenBuffers();
		vbos.add(this);
	}

	protected void bind() {
		glBindBuffer(type, vbo);
	}

	protected void unbind() {
		glBindBuffer(type, 0);
	}

	public void delete() {
		glDeleteBuffers(vbo);
	}

	public static void cleanUp() {
		for (VBO vbo : vbos)
			vbo.delete();
	}

	public int getType() {
		return type;
	}

	public int getDataType() {
		return dataType;
	}

	public int getComponetCount() {
		return componetCount;
	}

	public int getSize() {
		return size;
	}
	
}
