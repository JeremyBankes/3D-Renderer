package com.jeremy.utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Logger {

	private static final String INFO = "INFO";
	private static final String DEBUG = "DEBUG";
	private static final String WARNING = "WARN";
	private static final String ERROR = "ERROR";
	private static final String UPDATE = "UPDATE";
	private static SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	
	private static boolean debug = true;

	private static final ArrayList<Long> WARNED = new ArrayList<Long>();

	public static void info(Object... text) {
		write("[", now(), "] ", INFO, ": ");
		writeln(text);
	}
	
	public static void debug(Object... text) {
		if (!debug) return;
		write("[", now(), "] ", DEBUG, ": ");
		writeln(text);
	}

	public static void warn(Object... text) {
		write("[", now(), "] ", WARNING, ": ");
		writeln(text);
	}

	public static void error(Object... text) {
		write("[", now(), "] ", ERROR, ": ");
		writeln(text);
	}

	public static void error(Exception e, boolean stop) {
		StringBuilder errorMessage = new StringBuilder();
		errorMessage.append(e.getClass().getSimpleName() + " - " + e.getMessage() + '\n');
		for (StackTraceElement trace : e.getStackTrace()) {
			if (trace.getClassName().startsWith("com.jeremy")) {
				errorMessage.append("  >> (" + trace.getFileName() + ":" + trace.getLineNumber() + ")\n");
			}
		}
		write("[", now(), "] ", ERROR, ": ");
		writeln(errorMessage.toString());
		if (stop)
			System.exit(1);
	}
	
	public static void error(Exception e) {
		error(e, false);
	}

	public static void warnOnce(Object... text) {
		long hash = Text.join(text).hashCode();
		if (WARNED.contains(hash))
			return;
		write("[", now(), "] ", WARNING, ": ");
		writeln(text);
		WARNED.add(hash);
	}

	public static void update(Object... text) {
		write("[", now(), "] ", UPDATE, ": ");
		writeln(text);
	}

	public static void write(Object... text) {
		System.out.print(Text.join(text));
	}

	public static void writeln(Object... text) {
		write(text);
		System.out.println();
	}

	private static String now() {
		return timeFormat.format(new Date(System.currentTimeMillis()));
	}

}
