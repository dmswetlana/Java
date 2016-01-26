package ru.spec.java1.lec3;

public class Ext extends Base {

	final static String PI;

	String name = get("world");

	{

		System.out.println("Ext.init() " + name);
	}

	static {
		PI = "3.14";
		System.out.println("STATIC Ext.init() ");
	}

	static String tmp = get("123");

	static String get(String s) {
		System.out.println(s);
		return s;
	}

	public Ext() {
		super();
		// TODO fields
		f();
		System.out.println("Ext()");

	}

	public Ext(int i, int j) {

		this();
		//super("i=="+i);
		// TODO fields
		f();
		System.out.println("Ext()");

	}

	@Override
	void f() {
		System.out.println("extF()" + name);
	}

}
