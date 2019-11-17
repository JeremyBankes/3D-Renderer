package com.jeremy.utilities;

public class Regex {

	public static final String get(String text, String regex) {
		String[] cuts = text.split(regex);
		for (String cut : cuts) {
			text = text.replace(cut, "");
		}
		return text;
	}

	public static final String cut(String text, String regex) {
		return text.replaceAll(regex, "");
	}

	public static final String cut(String text, String regex, int times) {
		for (int i = 0; i < times; i++)
			text = text.replaceFirst(regex, "");
		return text;
	}

	public static final String replace(String text, String regex, String replacement) {
		return text.replaceAll(regex, replacement);
	}

	public static final String replaceFirst(String text, String regex, String replacement) {
		return text.replaceFirst(regex, replacement);
	}

	public static final boolean matches(String text, String regex) {
		return text.matches(regex);
	}

	public static final String[] split(String text, String regex, int times) {
		return text.split(regex, times);
	}

	public static final String[] split(String text, String regex) {
		return text.split(regex);
	}

}
