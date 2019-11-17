package com.jeremy.renderer.graphics.data;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL30.*;

import java.util.ArrayList;

public class Texture {

	private static ArrayList<Texture> textures = new ArrayList<Texture>();

	private int texture;
	private float[] textureCoords;

	public Texture(String path, float[] textureCoords, boolean mipMaps) {
		Image image = new Image(path);
		this.textureCoords = textureCoords;

		texture = glGenTextures();

		bind();

		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		glTexImage2D(GL_TEXTURE_2D, 0, 4, image.getWidth(), image.getHeight(), 0, GL_RGBA, GL_UNSIGNED_BYTE, image.getABGR());

		unbind();

		if (mipMaps) {
			glGenerateMipmap(GL_TEXTURE_2D);
		}

		textures.add(this);
	}

	public float[] getTextureCoords() {
		return textureCoords;
	}

	public void delete() {
		glDeleteTextures(texture);
	}

	public void setActive() {
		glActiveTexture(GL_TEXTURE0);
	}

	public void bind() {
		glBindTexture(GL_TEXTURE_2D, texture);
	}

	public void unbind() {
		glBindTexture(GL_TEXTURE_2D, 0);
	}

	public static void cleanUp() {
		for (Texture texture : textures)
			texture.delete();
	}

}
