package com.jeremy.renderer.graphics.shader;

import static org.lwjgl.opengl.GL20.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.jeremy.utilities.Logger;

public class Shader {

	public static final int VERTEX = GL_VERTEX_SHADER;
	public static final int FRAGMENT = GL_FRAGMENT_SHADER;

	private String path;
	private int type;
	private String source;
	protected int shader;

	public Shader(String path, int type) {
		this.path = path;
		this.type = type;

		loadShaderFile();

		shader = glCreateShader(type);
		glShaderSource(shader, source);
		glCompileShader(shader);
		
		checkCompilationProblems();
	}

	private void loadShaderFile() {
		StringBuilder builder = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)));
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				builder.append(line).append('\n');
			}
			source = builder.toString();
			reader.close();
		} catch (Exception e) {
			Logger.error(e, "Failed to load shader '" + path + "'", true);
		}
	}

	private void checkCompilationProblems() {
		String log = glGetShaderInfoLog(shader);
		if (log.length() == 0) {
			Logger.debug("Successfully compiled shader '" + path + "'");
			return;
		}
		Logger.error(new Exception("Failed to compile shader '" + path + "'\n" + log.trim()), true);
	}

	public void delete() {
		glDeleteShader(shader);
	}

	public String getName() {
		return path;
	}

	public int getType() {
		return type;
	}

	public String getSource() {
		return source;
	}
}
