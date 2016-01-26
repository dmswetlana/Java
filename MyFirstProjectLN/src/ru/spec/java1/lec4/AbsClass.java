package ru.spec.java1.lec4;

public abstract class AbsClass {

	public abstract void draw();
	
	static class Ext extends AbsClass implements Runnable{
		@Override
		public void draw() {
			System.out.println("nested");
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static void main(String[] args) {
		AbsClass ac = new AbsClass(){
			@Override
			public void draw() {
				System.out.println("inner class");
			}
		};
		ac.draw();
		new Ext().draw();
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
