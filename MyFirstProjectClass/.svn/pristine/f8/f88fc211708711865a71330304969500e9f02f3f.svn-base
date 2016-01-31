package ru.spec.java1.lec1;

public class Loops {

	public static void main(String[] args) {

		for (String arg : args) {
			System.out.println(arg);
		}
		
		for (int i = 0; i < args.length; i++) {
//			args.length=3;
			String arg = args[i];
			System.out.println(arg);
		}
		

		int i = 5;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		// i=5;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);

		for (int tmp = 0; tmp < 10; tmp = tmp + 2) {
			System.out.println("tmp=" + tmp);
		}

		int array[] = { 6, 2, 7, 1 };
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

		String word = "hello world";
		System.out.println(word);
		// ############
		// ############
		// ############
		// ############
		// ############

		int height = 5;
		int width = 10;

		draw(height, width);

	}

	private static void draw(int height, int width) {
		for (int y = 0; y < height; y++) {
			drawLine(width);
		}
	}

	private static void drawLine(int width) {
		for (int x = 0; x < width; x++) {
			System.out.print("#");
		}
		System.out.println();
	}

}
