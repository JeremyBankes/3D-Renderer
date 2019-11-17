package com.jeremy.renderer.light;

import math.vector.vec3.Vector3;

public class LightSource {

	private Vector3 position;
	private Vector3 color;

	public LightSource(Vector3 position, Vector3 color) {
		super();
		this.position = position;
		this.color = color;
	}

	public Vector3 getPosition() {
		return position;
	}
	
	public Vector3 getColor() {
		return color;
	}
	
	public void setPosition(Vector3 position) {
		this.position = position;
	}
	
	public void setColor(Vector3 color) {
		this.color = color;
	}
	
}
