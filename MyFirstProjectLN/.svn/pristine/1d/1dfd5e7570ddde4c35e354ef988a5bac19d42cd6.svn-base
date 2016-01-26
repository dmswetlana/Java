package ru.spec.java1.lec2;

public class Main {

	static int f(Cat i){
		i.setName("world");
		return i.getAge();
	}
	
	public static void main(String[] v) {

		int i=5;
		int k=6;
		
		Cat c = new Cat();
		c.setName("hello");
		System.out.println(f(c));
		System.out.println(c.getName());
		
	}


	private static void arrays() {
		int[] array = new int[10];// { 1, 2, 33, 4, 5, 6 };
		int[][] matrix = new int[10][10];
		matrix[0] = new int[] { 1, 2, 3 };
		System.out.println(matrix[0][2]);
		// System.out.println(array[2]);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]++ + " ");
		}

		System.out.println();

		for (int j : array) {
			System.out.print(j + " ");
		}
		int h = 10;
		int w = 10;
		char c = '#';

		// TODO
		/*
		 * w
		 * #######
		 * h #######
		 * #######
		 */

OUTTER:	for (int i = 0; i < 10; i++) {
			System.out.println("start");
		System.out.println("1");
			System.out.println("2");
	
MIDDLE:		for (int j = 0; j < 10; j++) {
INNER:			for (int k = 0; k < 10; k++) {
					if (k > 5 && i > 5 && j > 5) {
						continue INNER;
					}
					System.out.println("i="
							+ i
							+ "; "
							+ "j="
							+ j
							+ "; "
							+ "k="
							+ k);
				}
			}
		}
		for(;;){
			
		}
	}
	

	private static void types() {
		Integer i1 = 225; // new Integer(5);
		Integer i2 = 225; // new Integer(5);
		Integer i3 = new Integer(5);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i3));

		String a = "hello world";
		String b = "hello world";
		String c = "hello" + " world";
		String d = "hello";
		String e = d + " world";
		String f = new String("hello world");

		Cat c1 = new Cat();
		Cat c2 = new Cat();
		c1.setName("hello");
		c2.setName("hello");
		c1.setAge(1);
		c2.setAge(1);

		c1.setParent(c2);
		Object tmp = c1;
		c1 = (Cat) tmp;
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(tmp.toString());

		Long l = 5L;
		l = l * l;
		System.out.println(l.getClass());
		System.out.println(l);
		System.out.println(Float.MAX_VALUE);
		long val = (long) Float.MAX_VALUE;
		float fl = 0;
		System.out.println(val);
		fl = val;
		val = (long) fl;
		System.out.println(val);
		System.out.println((long) ((float) Long.MAX_VALUE));

		System.out.println("hello \n world");

		Long l1 = 5L;
		Long l2 = new Long(4);
		System.out.println(l1 == l2);
		System.out.println(l1 == (l2 + 1));
	}

}
