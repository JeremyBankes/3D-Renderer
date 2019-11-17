package com.jeremy.renderer.entity;

import com.jeremy.renderer.graphics.shader.ShaderProgram;

public abstract class Entity {
	
	protected float x, y, z;
	protected float xVelocity, yVelocity, zVelocity;
	protected float yaw, pitch, roll;

	public abstract void tick();
	public abstract void render(ShaderProgram shaderProgram);

}
