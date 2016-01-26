
public class Page80 {

	public static void main(String[] args) {
		// вычислим площадь круга
		
		double pi, r, s;
		
		r=10.8; // радиус окружности
		pi=3.1416; //приблизительное значение числа пи
		
		s = pi * r * r; //площадь круга
				
		System.out.println("Площадь круга равна " + s);
	

	//применение типа данных char
	
	char ch1, ch2;
	ch1 = 88; //код символа x
	ch2 = 'Y';
	System.out.println("ch1 = " + ch1);
	System.out.println("ch2 = " + ch2);
	
	//символьные переменные ведут себя как
	//целочисленные значения
	
	ch1='X';
	System.out.println("ch1 содержит " + ch1);
	
	ch1++;
	System.out.println("ch1 теперь содержит " + ch1);
}	
}
