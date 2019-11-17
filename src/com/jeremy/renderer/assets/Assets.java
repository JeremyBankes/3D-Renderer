package com.jeremy.renderer.assets;

import java.io.FileNotFoundException;
import java.io.InputStream;

import com.jeremy.renderer.graphics.data.Model;
import com.jeremy.renderer.graphics.data.Texture;
import com.jeremy.renderer.objectLoader.Obj;
import com.jeremy.renderer.objectLoader.ObjData;
import com.jeremy.renderer.objectLoader.ObjReader;
import com.jeremy.renderer.objectLoader.ObjUtils;
import com.jeremy.utilities.Logger;

public class Assets {

	public enum Models {
		PLAYER("/models/chess.obj", "/textures/player.png");

		private final Model model;

		private Models(String modelPath, String texturePath) {
			model = loadModel(modelPath, texturePath);
		}

		public Model get() {
			return model;
		}
	}

	public static Model loadModel(String modelPath, String texturePath) {
		InputStream stream = Assets.class.getResourceAsStream(modelPath);
		if (stream == null) {
			Logger.error(new FileNotFoundException("Failed to find '" + modelPath + "'"), true);
		}
		Obj obj = ObjUtils.convertToRenderable(ObjReader.read(stream));
		float[] vertices = ObjData.getVerticesArray(obj);
		float[] textureCoords = ObjData.getTexCoordsArray(obj, 2);
		float[] normals = ObjData.getNormalsArray(obj);
		int[] indices = ObjData.getFaceVertexIndicesArray(obj);
		Texture texture = new Texture(texturePath, textureCoords, true);
		return new Model(texture, vertices, indices, normals);
	}

}
