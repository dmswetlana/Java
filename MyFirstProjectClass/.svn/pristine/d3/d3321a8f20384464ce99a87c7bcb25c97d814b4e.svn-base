package ru.spec.java1.lec2;


public class Palindrom {

	long value;

	final double MAX_VALUE;

	static int count = 0;

	public Palindrom(int size) {
		java.lang.System.out.println("Palindrom() #" + (++count) + " // construct");
		MAX_VALUE=size;
	}

	public static void main(String... args) {
		Palindrom p = new Palindrom(5);

		System.out.println(Math.sin(1));
		System.out.println(Math.pow(2, 32));
		
//		for(int i=0 ; i< 100 ; i++)
//			System.out.println(((int)(Math.random()*11)) + 10); // 10 - 20
		
		for (int i = 0; i < 10; i++)
			p = new Palindrom(6);
		System.out.println(isPalindrom(255, 16));

		int radix1 = 16;
		int radix2 = 7;

		double j = 5d / 6 * 12;// F L D
		int i = 0xDEAD_BEEF;
		System.out.println(j);

		byte b = 127;
		System.out.println(b + 1);
		System.out.println(b++);
		System.out.println(b);

		b = (byte) (b + (byte) 1);
		// b=b+b;
		int c = 255;
		c = c + c;

		boolean bool = false;

		int[] array, ar2;

		c = bool ? 1 : 0;

		c = radix1 < radix2 ? -1 : (radix1 > radix2 ? 1 : 0);

		if (bool) {
			c = 1;
		} else {
			c = 0;
		}

		 findPalindroms(2, 8, 10);

	}

	private static void findPalindroms(int... radixs) {
OUTTER: for (long i = 0; i < 1_000_000_000_000L; i++) {
			for (int r : radixs) {
				if (!isPalindrom(i, r)) {
					continue OUTTER;
				}

			}
			
			for (int r : radixs) {
				System.out.print(Long.toString(i, r) + "(" + r + "); ");
			}
			System.out.println();
		}
	}

	public static boolean isPalindrom(long value, int ragix) {
		return isPalindrom(Long.toString(value, ragix));
	}

	public static boolean isPalindrom(String src) {
		if (src == null)
			return false;

		int maxLength = src.length() - 1;
		int halfLength = src.length() / 2;

		for (int i = 0; i < halfLength; i++) {// alt+shift+L to create local var
			if (src.charAt(i) != src.charAt(maxLength - i))
				return false;
		}
		return true;
	}

}
