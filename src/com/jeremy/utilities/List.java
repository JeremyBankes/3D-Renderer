package com.jeremy.utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class List {

	public static final <T> ArrayList<T> convert(T[] array) {
		return new ArrayList<T>(Arrays.asList(array));
	}

	public static final <T> boolean anyMatch(T object, T[] array) {
		for (T match : array) {
			if (match.equals(object))
				return true;
		}
		return false;
	}

}
