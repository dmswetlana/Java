package ru.spec.java1.lec4;

import java.lang.reflect.InvocationTargetException;

@MyAnnotation(
		value={2,3,43,44,5,546,5,6},
		hello="123qwe"
)
public class MyClass {

	@MyAnnotation(hello="void f()...")
	public void  f(){
		System.out.println("f() invoked");
	}
	
	@MyAnnotation(hello="qwertyuio")
	public static void main(@MyAnnotation String...args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println(MyClass.class);

//		System.out.println(args[0]);
//		main("123","asdsf");
		@MyAnnotation
		Class<MyClass> clz = MyClass.class;
		System.out.println(clz.getAnnotation(MyAnnotation.class));
		System.out.println(
				clz.getMethod("main", String[].class).getAnnotation(MyAnnotation.class)
				);
		System.out.println(
				clz.getMethod("f").getAnnotation(MyAnnotation.class)
				);
		
		clz.getMethod("f").invoke(new MyClass());
		
	}

}
