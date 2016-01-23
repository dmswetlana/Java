package ru.spec.java1.lec1;

public class MyFirstClass {

	public static void main(String[] args) {
		System.out.println("Hello, world");
		

	int height=5;
	int width =10;
	
	for (int y=0; y< height; y++){
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