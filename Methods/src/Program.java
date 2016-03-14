//урок по модулю 3
//Методы.

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static java.lang.System.out;

public class Program {

	//создаём массив строк, преобразуем в коллекцию
	public static List<String> sortNames(String... names)
	{
		List<String> c = Arrays.asList(names); //Преобразуем массив в коллекцию
		Collections.sort(c); //сортируем
		return c;
	}
	
	//передача параметров по значению
	static void test1(int a)
	{ 	a++;
		out.printf("test1 = %d\n ", a);
	}

	//передача параметров по ссылке
	static void test2(int [] a)
	{ 	a[0]++;
		out.printf("test2 = %d\n ", a[0]);
	}
	
	//метод вычисляет ср.арифм. для любого кол-ва чисел
	public static double average(int... m ){
		int summa = 0;
		for (int k : m)
		summa += k;
		return (double)summa/m.length;	
	}

	
	//метод вычисляет среднее арифметическое двух чисел
	public static double average(int x, int y){
		double avg = (x+y)/2D;
		return avg;
		
	}
	//метод без параметров
	public  void sayHello(){
		//out.println("Привет");
		sayHello("Незнакомец");
	}
	
	//метод с одним параметром
	public  void sayHello(String name){
		out.printf("Привет, %s!\n", name);
	}
	
	//метод с двумя параметрами
	public  void sayHello(String name, int age){
		out.printf("Привет, %s! %d\n", name, age);
	}
	public static void main(String[] args) {
		{ 	int a=10;
			test1(a);
			out.printf("main 1 = %d\n", a);
		}
		{ 	int []a={10};
		test2(a);
		out.printf("main 2 = %d\n", a[0]);
		}
		//sayHello();
		// Program.sayHello();
		Program p= new Program();
		p.sayHello();
		p.sayHello("Катя");
		p.sayHello("Катя", 30);
		double a = average(10,20);
		out.println(a);
		out.println(average(10,20)); //или можно так записать
		out.println(average(new int[] {10, 20,30,40}));
		out.println(average(10, 20,30,40));
		
		for (String name : sortNames("Даша", "Сергей", "Маша", "Оля"))
			out.println(name);
		

	}

}
