package ru.spec.java1.lec5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.Date;

public class Main {

	public static void main(final String[] args) throws CloneNotSupportedException,IOException, ClassNotFoundException {
		
		Cat c = new Cat();
		c.setCount(1);
		c.setHash(BigDecimal.ZERO);
		c.setName("hello world");
		c.setTime(new Date());
		Cat c1 = c.clone();
		c1.setName("qwertyu");
		c.setParent(c1);
		
		File f = new File("C:/Users/student/Downloads/cat.bin");
		save(c, f);
		
		Cat c2;
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		c2 = (Cat) ois.readObject();
		ois.close();
		
		System.out.println(c2);

	}

	private static void save(Cat c, File f) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.close();
	}

}
