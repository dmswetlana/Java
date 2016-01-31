package ru.spec.java1.lec1;

import java.io.PrintStream;
import java.util.Date;

public class MyFistClass {

	int i;
	String s;
	Date d;
	PrintStream ps = System.err;

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.printf("%d km\n", 10);
		PrintStream out = System.out;
		out.println(new Date());
		out.println(new Date().getTime());
		out.println(System.currentTimeMillis());
		out.println(System.nanoTime());
		out.println(System.nanoTime());
		System.out.println(new Date(Long.MAX_VALUE / 1_000_000));

		System.out.println(
				new Date(
						new Date().getTime()
						- System.nanoTime() / 1_000_000));

	}

	@SuppressWarnings("unused")
	private void f() {
		ps.println("123");
	}

}
