package ru.spec.java1.lec2;

import java.util.Date;

public class CompStartTime {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		long nano = System.nanoTime();
		System.out.println(new Date(time-nano/1_000_000));
		long times[] = new long[50];
		for (int i = 0; i < 50; i++) {
			times[i]=System.nanoTime();
		}
		for (long l : times) {
			System.out.println(l);
		}
		
		double d = 324D/122;
		System.out.println(d);
		/*
		 * 8/6
		 * 8%6=2
		 * 8 = 6 x1 + 2 
		 * 6 = 2 x3 + 0
		 * 6/2=3
		 * 6%2=0
		 */
	}
}
