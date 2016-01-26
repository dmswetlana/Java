package ru.spec.java1.lec4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyException {

	public static void main(String[] args) {
		
		try {
			File f = new File("c:/123.txt");
			Scanner s = new Scanner(f);
		} catch (FileNotFoundException e) {
//			throw new RuntimeException(e);
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		
		try(Scanner s = new Scanner(new File("1234.txt"))){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
		
		

	}

}
