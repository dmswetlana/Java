package ru.spec.java1.lec3;

public class Outter {

	static private int i =5;
	private int k =7;
	
	void f(){
		System.out.println("Outter.f()");
	}
	
	public static class Nested extends Outter{
		
		void g(){
			System.out.println("Nested.g()"
					+ " "
					+ i);
		}
	}
	public class Dyn extends Nested{
		void g(){
			System.out.println("Nested.g()"
					+ " "
					+ k);
		}
	}
	
	public static void main(String[] args) {
		
		int localVar = 10;
		
		//localVar/=2;
		
		class Inner extends Nested{
			int var;
			
			public Inner(int var) {
				this.var=var;
			}
			
			void f(){
				System.out.println("Inner.f()");
			}
		}
		
		Inner clz = new Inner(localVar);

		clz.f();
		

		Inner clz2 = new Inner(5){
			@Override
			void f() {
				System.out.println("Annon.f()");
			}
		};
		clz2.f();
		//clz.g();
		
		Outter o = new Outter();
		Nested n = new Outter.Nested();
		n.g();
		
		Dyn d = o.new Dyn();
		

	}

}
