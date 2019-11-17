package com.jeremy.renderer.entity.entities.creatures;

import static java.lang.Math.*;

import java.util.UUID;

import com.jeremy.renderer.assets.Assets;
import com.jeremy.renderer.entity.entities.Creature;
import com.jeremy.renderer.graphics.Camera;
import com.jeremy.renderer.graphics.Window.KeyEvent;
import com.jeremy.renderer.graphics.shader.ShaderProgram;
import com.jeremy.renderer.input.KeyInput;
import com.jeremy.renderer.input.MouseInput;
import com.jeremy.renderer.light.LightSource;

import math.vector.vec3.Vector3;

public class Player extends Creature {

	private float zVelocity = 0.01f;
	private float acceleration = 0.03f;
	private float deceleration = 0.90f;
	private float maxMoveVelocity = 0.1f;

	public static final int CAMERA_NO_FOLLOW = 0;
	public static final int CAMERA_FIRST_PERSON = 1;
	public static final int CAMERA_SECOND_PERSON = 2;
	public static final int CAMERA_THIRD_PERSON = 3;

	public LightSource light;

	private final String name;
	private final UUID uuid;

	private int cameraMode;

	public Player(String name) {
		super(Assets.Models.PLAYER.get().scale(0.03f));
		this.name = name;
		this.displayName = name;
		this.uuid = UUID.randomUUID();
		this.cameraMode = CAMERA_FIRST_PERSON;
		light = new LightSource(new Vector3(0, 0, 0), new Vector3(1, 1, 1));
	}

	public void tick() {
		float wantYaw = (float) -MouseInput.getX() / 10;
		float wantPitch = (float) -MouseInput.getY() / 10;

		float speed = 0.5f;

		if (yaw > wantYaw) {
			yaw -= speed * Math.abs(yaw - wantYaw);
			if (yaw < wantYaw) yaw = wantYaw;
		} else if (yaw < wantYaw) {
			yaw += speed * Math.abs(yaw - wantYaw);
			if (yaw > wantYaw) yaw = wantYaw;
		}
		if (pitch > wantPitch) {
			pitch -= speed * Math.abs(pitch - wantPitch);
			if (pitch < wantPitch) pitch = wantPitch;
		} else if (pitch < wantPitch) {
			pitch += speed * Math.abs(pitch - wantPitch);
			if (pitch > wantPitch) pitch = wantPitch;
		}

		/*
		 * if (yaw > 360) yaw -= 360; if (yaw < 0) yaw += 360; if (pitch > 360) pitch -=
		 * 360; if (pitch < 0) pitch += 360;
		 */

		if (cameraMode == CAMERA_FIRST_PERSON) {
			Camera.setPosition(x, y + 3, z);
			Camera.setYaw(yaw);
			Camera.setPitch(pitch);
			Camera.setRoll(roll);
		}

		doMovement();
	}

	private void doMovement() {
		if (KeyInput.isPressed(KeyEvent.KEY_SPACE)) {
			if (yVelocity < maxMoveVelocity) yVelocity += acceleration;
		}
		if (KeyInput.isPressed(KeyEvent.KEY_LEFT_SHIFT)) {
			if (yVelocity > -maxMoveVelocity) yVelocity -= acceleration;
		}
		if (KeyInput.isPressed(KeyEvent.KEY_W)) {
			xVelocity -= acceleration * sin(toRadians(yaw));
			zVelocity += acceleration * cos(toRadians(yaw));
		}
		if (KeyInput.isPressed(KeyEvent.KEY_S)) {
			xVelocity += acceleration * sin(toRadians(yaw));
			zVelocity -= acceleration * cos(toRadians(yaw));
		}
		if (KeyInput.isPressed(KeyEvent.KEY_A)) {
			xVelocity -= acceleration * cos(toRadians(yaw));
			zVelocity -= acceleration * sin(toRadians(yaw));
		}
		if (KeyInput.isPressed(KeyEvent.KEY_D)) {
			xVelocity += acceleration * cos(toRadians(yaw));
			zVelocity += acceleration * sin(toRadians(yaw));
		}
		xVelocity *= deceleration;
		yVelocity *= deceleration;
		zVelocity *= deceleration;
		x += xVelocity;
		y += yVelocity;
		z += zVelocity;

		light.setPosition(new Vector3(x, y, z));
	}

	public void render(ShaderProgram shaderProgram) {
		shaderProgram.setUniform("lightPosition", light.getPosition());
		shaderProgram.setUniform("lightColor", light.getColor());
		model.render(shaderProgram);
	}

	public String getName() {
		return name;
	}

	public UUID getUUID() {
		return uuid;
	}

}
