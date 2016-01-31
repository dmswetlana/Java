package ru.spec.java1.lec2;

import java.util.Arrays;

public class Cat {

	public int age;
	public String name;
	public String color;
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.age=10;
		cat.color="black";
		cat.name="tishka";
		System.out.println(cat);
//		cat = null;

		System.out.println(Arrays.toString(
				cat.getClass().getFields()));
		
//		System.out.println(2+1+"=2+1");
		System.out.println(2+1+"=2+1="+2+1);
		System.out.println(3/4*800);
		System.out.println(3.0/4*800);
		System.out.println('a'+'b'+'='+"ab");
		System.out.println("ab"+'='+'a'+'b');
		System.out.println(""+(char)('a'-('a'-'A')));
		System.out.println("абв".length());
		System.out.println("абв".getBytes().length);
		
		Integer i = -200;
		Integer j = -200;
		for(int k=0; k<400; k++){
			System.out.println("i="
					+ i
					+ " "
					+ "i==j?="
					+ (i==j));
			i++;
			j++;
		}
		Integer m = 505;
		System.out.println(new Integer(5)+new Integer(500)==m);
		System.out.println(new Integer(500)==500);
		System.out.println(500L==500);
		System.out.println(Long.toString(36,2));
		

	}

	
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + ", color=" + color + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
