package com.jeremy.renderer.input;

import com.jeremy.renderer.graphics.Window.KeyEvent;

public class KeyInput {

	private static boolean[] pressed = new boolean[512];

	public static void keyEvent(int key, int action) {
		if (action == KeyEvent.ACTION_PRESS) {
			pressed[key] = true;
		} else if (action == KeyEvent.ACTION_RELEASE) {
			pressed[key] = false;
		}
	}

	public static boolean isPressed(int... keys) {
		for (int key : keys)
			if (pressed[key])
				return true;
		return false;
	}
	
	private KeyInput() {};

}
