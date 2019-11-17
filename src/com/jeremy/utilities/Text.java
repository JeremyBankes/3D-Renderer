package com.jeremy.utilities;

import static com.jeremy.utilities.List.*;

import java.util.Arrays;

public class Text {

	public static Character[] spaceCharacters = { ' ', '-', '_' };

	public static final String join(String seperator, Object... objects) {
		StringBuilder builder = new StringBuilder();
		for (Object object : objects) {
			if (object != null) {
				if (object != objects[0])
					builder.append(seperator);
				builder.append(object.toString());
			}
		}
		return builder.toString();
	}

	public static final String join(Object... objects) {
		return join("", objects);
	}

	public static final String[] split(String seperator, String text, int times) {
		return text.split(seperator, times + 1);
	}

	public static final String[] split(String seperator, String text) {
		return text.split(seperator);
	}

	public static final String capitalizeFirst(String text) {
		StringBuilder builder = new StringBuilder(text);
		builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
		for (int i = 1, len = builder.length(); i < len; i++) {
			if (anyMatch(builder.charAt(i - 1), spaceCharacters)) {
				builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
			}
		}
		return builder.toString();
	}

	public static final String trimStart(String text) {
		return trimStart(text, ' ');
	}

	public static final String trimEnd(String text) {
		return trimEnd(text, ' ');
	}

	public static final String trimStart(String text, char trim) {
		if (text.length() <= 0)
			return text;
		int start = 0;
		while (text.charAt(start) == trim) {
			start++;
		}
		return text.substring(start, text.length());
	}

	public static final String trimEnd(String text, char trim) {
		if (text.length() <= 0)
			return text;
		int end = 0;
		int len = text.length();
		while (text.charAt(len - 1 - end) == trim) {
			end++;
		}
		return text.substring(0, len - end);
	}

	public static final String repeat(String text, int times) {
		String[] result = new String[times];
		Arrays.fill(result, text);
		return join((Object[]) result);
	};

	public static final int count(String text, int character) {
		int count = 0;
		char[] chars = text.toCharArray();
		for (char c : chars) {
			if (c == character)
				count++;
		}
		return count;
	}

	private Text() {}

}
