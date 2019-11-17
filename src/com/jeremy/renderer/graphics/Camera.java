package com.jeremy.renderer.graphics;

import math.matrix.mat4.Matrix4;

public class Camera {

	private static Matrix4 view = new Matrix4();

	private static float x, y, z;
	private static float yaw, pitch, roll;

	public static void tick() {
		view = new Matrix4();
		view.rotateX(pitch);
		view.rotateY(yaw);
		view.rotateZ(roll);
		view.translate(-x, -y, -z);
	}

	public static Matrix4 getView() {
		return view;
	}

	public static void setPosition(float x, float y, float z) {
		Camera.x = x;
		Camera.y = y;
		Camera.z = z;
	}

	public static void setYaw(float yaw) {
		Camera.yaw = yaw;
	}

	public static void setPitch(float pitch) {
		Camera.pitch = pitch;
	}

	public static void setRoll(float roll) {
		Camera.roll = roll;
	}

	private Camera() {
	};

}
