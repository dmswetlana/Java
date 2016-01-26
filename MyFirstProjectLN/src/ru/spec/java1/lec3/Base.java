package ru.spec.java1.lec3;

public class Base{

	static {
		System.out.println("STATIC Base.init() ");
	}
	
	static String tmp=get("---------123");
	
	static String get(String s){
		System.out.println(s);
		return s;
	}
	
	String name="hello";
	
	public Base() {
		f();
		System.out.println("Base()");
		
	}
	
	public Base(String name) {
		setName(name);
		f();
		System.out.println("Base(n="
				+ name
				+ ")");
	}
	
	void f(){
		
		System.out.println(this+".f();");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		//Base b =new Base("varB");
		//b=new Base();
		//b.setName("varB");
		//b.f();
		
		Base b2 = new Ext();
		
		System.out.println("!!!!!! "
				+ b2.name);
		
		Ext e = (Ext) b2;
		System.out.println("!!!!!! "
				+ e.name);
		b2 = new Ext();
		
		//b2.f();

	}

	@Override
	public String toString() {
		return name;
	}
}
