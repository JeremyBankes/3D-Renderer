package com.jeremy.utilities;

public class Number {

	public static final boolean isShort(Object object) {
		try {
			Short.parseShort(object.toString());
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static final short asShort(Object object) {
		try {
			return Short.parseShort(object.toString());
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	public static final boolean isInt(Object object) {
		try {
			Integer.parseInt(object.toString());
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static final int asInt(Object object) {
		try {
			return Integer.parseInt(object.toString());
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	public static final boolean isLong(Object object) {
		try {
			Long.parseLong(object.toString());
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static final long asLong(Object object) {
		try {
			return Long.parseLong(object.toString());
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	public static final boolean isFloat(Object object) {
		try {
			Float.parseFloat(object.toString());
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static final float asFloat(Object object) {
		try {
			return Float.parseFloat(object.toString());
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	public static final boolean isDouble(Object object) {
		try {
			Double.parseDouble(object.toString());
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static final double asDouble(Object object) {
		try {
			return Double.parseDouble(object.toString());
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	public static final boolean inRange(double num, double min, double max) {
		if (num >= min && num <= max)
			return true;
		return false;
	}

	private Number() {}

}
