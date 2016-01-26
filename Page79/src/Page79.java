//вычислить расстояние, проходимое светом,
//используя переменные типа long

import static java.lang.System.out;

public class Page79 {

	public static void main(String[] args) {
		int lightspeed;
		long days;
		long second;
		long distance;
		
	//приблизительная скорость света, миль в секунду
		lightspeed=186000;
		
		days = 1000; //указали количество дней
		
		second = days * 24 * 60 * 60; //преобразовали в секунды
		
		distance = second * lightspeed; // вычислили расстояние
		
		out.print("За "+days);
		out.print(" дней свет пройдёт около " + distance + " миль." );
		

	}

}
