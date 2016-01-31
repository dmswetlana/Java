package ru.spec.java1.lec2;

public class Stat {

	public static void main(String[] args) {
		int count[] = new int[10]  ;
		for(int i=0 ; i< 100_000_000; i++){
			int tmp = getRandom();
			count[tmp]++;
		}
		for (int i : count) {
			System.out.println((i/100_000_000d*100)+"%");
		}

	}

	private static int getRandom() {
		return (int) (Math.random()*10);
	}

}
