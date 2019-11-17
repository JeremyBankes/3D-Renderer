package com.jeremy.renderer.entity.entities;

import com.jeremy.renderer.entity.Entity;
import com.jeremy.renderer.graphics.data.Model;
import com.jeremy.renderer.graphics.shader.ShaderProgram;

public abstract class Creature extends Entity {

	protected Model model;
	protected String displayName;

	public Creature(Model model) {
		this.model = model;
	}

	public abstract void tick();

	public abstract void render(ShaderProgram shaderProgram);
	
	public String getDisplayName() {
		return displayName;
	}
	
	public void setDisplayName(String name) {
		this.displayName = name;
	}

}
