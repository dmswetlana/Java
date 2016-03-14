//���� �� ������ 3
//������.

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static java.lang.System.out;

public class Program {

	//������ ������ �����, ����������� � ���������
	public static List<String> sortNames(String... names)
	{
		List<String> c = Arrays.asList(names); //����������� ������ � ���������
		Collections.sort(c); //���������
		return c;
	}
	
	//�������� ���������� �� ��������
	static void test1(int a)
	{ 	a++;
		out.printf("test1 = %d\n ", a);
	}

	//�������� ���������� �� ������
	static void test2(int [] a)
	{ 	a[0]++;
		out.printf("test2 = %d\n ", a[0]);
	}
	
	//����� ��������� ��.�����. ��� ������ ���-�� �����
	public static double average(int... m ){
		int summa = 0;
		for (int k : m)
		summa += k;
		return (double)summa/m.length;	
	}

	
	//����� ��������� ������� �������������� ���� �����
	public static double average(int x, int y){
		double avg = (x+y)/2D;
		return avg;
		
	}
	//����� ��� ����������
	public  void sayHello(){
		//out.println("������");
		sayHello("����������");
	}
	
	//����� � ����� ����������
	public  void sayHello(String name){
		out.printf("������, %s!\n", name);
	}
	
	//����� � ����� �����������
	public  void sayHello(String name, int age){
		out.printf("������, %s! %d\n", name, age);
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
		p.sayHello("����");
		p.sayHello("����", 30);
		double a = average(10,20);
		out.println(a);
		out.println(average(10,20)); //��� ����� ��� ��������
		out.println(average(new int[] {10, 20,30,40}));
		out.println(average(10, 20,30,40));
		
		for (String name : sortNames("����", "������", "����", "���"))
			out.println(name);
		

	}

}
