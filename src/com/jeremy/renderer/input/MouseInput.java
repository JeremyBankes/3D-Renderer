package com.jeremy.renderer.input;

import com.jeremy.renderer.graphics.Window.MouseEvent;

public class MouseInput {

	private static boolean[] pressed = new boolean[8];
	private static int x;
	private static int y;
	private static int xScroll;
	private static int yScroll;

	public static void buttonEvent(int button, int action) {
		if (action == MouseEvent.ACTION_PRESS) {
			pressed[button] = true;
		} else if (action == MouseEvent.ACTION_RELEASE) {
			pressed[button] = false;
		}
	}

	public static void scrollEvent(int xOffset, int yOffset) {
		MouseInput.xScroll = xOffset;
		MouseInput.yScroll = yOffset;
	}

	public static void moveEvent(int x, int y) {
		MouseInput.x = x;
		MouseInput.y = y;
	}

	public static int getX() {
		return x;
	}

	public static int getY() {
		return y;
	}

	public static int getXScroll() {
		return xScroll;
	}

	public static int getYScroll() {
		return yScroll;
	}

	public static void tick() {
		xScroll = 0;
		yScroll = 0;
	}

}
