package ru.spec.java1.dz;

import java.util.Date;

public class Fields {

	

	static int i=5;
	
	static  {
		System.out.println("static init");
		

	}
	
	


	
	public Fields () {
		System.out.println("Fields () "
				+ age
				+ "");
		
	}

	public Fields (int i) {
		Fields.i=i;
		System.out.println("Fields ("
				+ i
				+ ")");
	}
	
	int age=5;
	
	{
		System.out.println("init");
		age=6;
	}
	

	
	public static void main(String[] args) {
		System.out.println("start");
		i=5;
		Fields fs = new Fields();
		Other o = new Other();
		o.setDate(new Date());
		System.out.println(o.getDate().getTime());
		fs.age=6;
		staticF(fs);
		
		System.out.println(Math.pow(2, 10));
	}

	void f(){
		System.out.println("f()");

		
	}
	static void staticF(Fields inst){
		System.out.println("staticF()");
		
		
		
	}

}
