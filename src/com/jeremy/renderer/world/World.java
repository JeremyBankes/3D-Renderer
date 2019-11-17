package com.jeremy.renderer.world;

import java.util.ArrayList;
import java.util.Iterator;

import com.jeremy.renderer.entity.Entity;
import com.jeremy.renderer.graphics.shader.ShaderProgram;

public class World {

	private ArrayList<Entity> entities;

	public World() {
		entities = new ArrayList<Entity>();
	}

	public void spawn(Entity entity) {
		entities.add(entity);
	}

	public void tick() {
		for (Iterator<Entity> iterator = entities.iterator(); iterator.hasNext();) {
			Entity entity = iterator.next();
			entity.tick();
		}
	}

	public void render(ShaderProgram shaderProgram) {
		for (Iterator<Entity> iterator = entities.iterator(); iterator.hasNext();) {
			Entity entity = iterator.next();
			entity.render(shaderProgram);
		}
	}

}
