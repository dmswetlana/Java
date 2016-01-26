package ru.spec.java1.lec2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Streams {

	public static void main(String[] args) throws FileNotFoundException {
		//palindrom();
		System.out.println(System.console());
		
		File f = new File("C:/Users/student/file.txt");
		
		Scanner scanner = new Scanner(f);
		while(scanner.hasNextLine()){
			System.out.println(scanner.nextLine());
		}
		scanner.close();
		

	}

	private static void palindrom() {
		System.out.format("Hello, %S. Enter radix1:", "user1");
		// File f = new File("C:/Users/student/file.txt");
		Scanner scanner = new Scanner(System.in);

		int r1, r2;
		
		r1 = scanner.nextInt(10);
		System.out.println("radix1 " + r1);

		System.out.format("Hello, %S. Enter radix2:", "user1");

		System.out.println("radix2 " + (r2 = scanner.nextInt(10)));

		for (int i = 0; i < 1000; i++) {
			String s1 = Integer.toString(i, r1);
			String s2 = Integer.toString(i, r2);
			if (isPal(s1) && isPal(s2)) {
				System.out.format("%s(%d) - %s(%d)\n", s1, r1, s2, r2);
			}

		}
	}

	/**
	 * Строка палиндром
	 * https://ru.wikipedia.org/wiki/%D0%9F%D0%B0%D0%BB%D0%B8%D0%BD%D0%B4%D1%80%
	 * D0%BE%D0%BC
	 * 
	 * @param s
	 * @return
	 */
	private static boolean isPal(String s) {
		int len = s.length() / 2;

		for (int i = 0; i < len; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
