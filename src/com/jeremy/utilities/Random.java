package com.jeremy.utilities;

public class Random {

	public static final java.util.Random RANDOM = new java.util.Random();

	public static final int randInt(int min, int max) {
		return RANDOM.nextInt(max + Math.abs(min)) - min;
	}

	public static float randFloat(float min, float max) {
		return RANDOM.nextFloat() * (max - min) + min;
	}

}
