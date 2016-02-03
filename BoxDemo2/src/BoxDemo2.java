//в этой программе применяется метод, описанный в классе Box

class Box{
	double width;
	double heigth;
	double depth;
	
	//рассчитаем объём параллелепипеда
	void volume(){
		System.out.print("Объём параллелепипеда = ");
		System.out.println(width*heigth*depth);
	}
	
	double volume2() {
		return (width*heigth*depth);
	}
	
	void setDim( double w, double h, double d) {
		width = w;
		heigth = h;
		depth = d;
	}
}

public class BoxDemo2 {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		double vol;
		
		//присваиваем значения переменным класса mybox1
		mybox1.width = 10;
		mybox1.heigth = 20;
		mybox1.depth = 15;
		
		//присваиваем значения переменным класса mybox2
		mybox2.width = 3;
		mybox2.heigth = 6;
		mybox2.depth = 9;
		
		mybox1.volume();
		
		mybox2.volume();

		vol = mybox1.volume2();
		System.out.println("Объём первого = " + vol);
		
		vol = mybox2.volume2();
		System.out.println("Объём второго = " + vol);
		
		System.out.println("Объём " + mybox1.volume2());
		System.out.println("Объём " + mybox2.volume2());
		
		
		mybox1.setDim(11, 20, 15);
		mybox2.setDim(4, 10, 12);
		
		System.out.println("Объём mybox1 =" + mybox1.volume2());
		System.out.println("Объём mybox2 =" + mybox2.volume2());
		
		
	}

}
