package com.jeremy.renderer.graphics.shader;

import static org.lwjgl.opengl.GL20.*;

import java.util.ArrayList;
import java.util.HashMap;

import math.matrix.mat4.Matrix4;
import math.vector.vec2.Vector2;
import math.vector.vec3.Vector3;
import math.vector.vec4.Vector4;

public class ShaderProgram {

	private static ArrayList<ShaderProgram> programs = new ArrayList<ShaderProgram>();

	private HashMap<String, Integer> uniformLocations;

	private int program;

	public ShaderProgram() {
		uniformLocations = new HashMap<String, Integer>();
		program = glCreateProgram();
		programs.add(this);
	}

	public void addShader(Shader shader) {
		glAttachShader(program, shader.shader);
	}

	public void validate() {
		glLinkProgram(program);
		glValidateProgram(program);
	}

	public void use() {
		glUseProgram(program);
	}

	public void delete() {
		glDeleteProgram(program);
	}

	public void setUniform(String name, float val) {
		int location = getUniformLocation(name);
		glUniform1f(location, val);
	}

	public void setUniform(String name, Vector2 vec2) {
		int location = getUniformLocation(name);
		glUniform2f(location, vec2.x, vec2.y);
	}

	public void setUniform(String name, Vector3 vec3) {
		int location = getUniformLocation(name);
		glUniform3f(location, vec3.x, vec3.y, vec3.z);
	}

	public void setUniform(String name, Vector4 vec4) {
		int location = getUniformLocation(name);
		glUniform4f(location, vec4.x, vec4.y, vec4.z, vec4.w);
	}

	public void setUniform(String name, Matrix4 mat4) {
		int location = getUniformLocation(name);
		glUniformMatrix4fv(location, false, mat4.toArray());
	}

	public int getUniformLocation(String name) {
		if (uniformLocations.containsKey(name))
			return uniformLocations.get(name);
		int loc = glGetUniformLocation(program, name);
		uniformLocations.put(name, loc);
		return loc;
	}

	public static void cleanUp() {
		for (ShaderProgram program : programs)
			program.delete();
	}

}
