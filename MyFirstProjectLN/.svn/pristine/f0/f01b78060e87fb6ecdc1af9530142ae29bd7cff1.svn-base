package ru.spec.java1.lec4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Streams {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		int[] array = new int[10];
		
		System.out.println("sleep");
		//TimeUnit.SECONDS.sleep(5);
		System.out.println("wakeup");
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0 ; i<array.length ; i++){
			System.out.println("enter array["
					+ i
					+ "]="
					+ "");
			
			try{
				array[i]=scanner.nextInt();
				throw new RuntimeException("hello");
			} catch (InputMismatchException e){
				System.err.println("Enter number [0-9] "+e);
				//e.printStackTrace();
				
				
				
				i--;
				scanner.next();
				try{
					throw new RuntimeException(e);
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
				
				continue;
			} catch (Exception e) {
				System.out.println("world");
			}
			
		}
		
		System.out.println(Arrays.toString(array));
	}
}
