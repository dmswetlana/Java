//�������� ������ Person � ������������� � �������  � ��

import java.util.*;

public class Program 
{
	//��������� ������� �������������� ���� �����
	public static double average(int x, int y){
		double c = (x+y)/2D;
		return c;
	}
	
	//������ ����� ��� ������������� ���������� �����
// public static double average(int [] m)
	public static double average(int... m){
		int summa = 0;
		for (int s : m ) 
			summa += s;
		return (double)summa/m.length;
	}
	
	
	public void sayHello(){
		//System.out.println("������!");
		sayHello("����������", 10);
	}
	
	public void sayHello(String name){
		System.out.printf("������ %s!\n ", name);
	}
	
	public void sayHello(String name, int age){
		System.out.printf("������ %s!  %d\n", name, age);
	}
	
	static void test1(int a){
		a++;
		System.out.printf("test1 ��� main a=%d\n", a);
	}
	
	static void test2(int[] a){
		a[0]++;
		System.out.printf("test2 ��� main a=%d\n", a[0]);
	}

	//������ ��������� �� ������� ����� � ��������� �
	public static List<String> sortNames(String ... names ){
		List<String> c = Arrays.asList(names);
		Collections.sort(c);
		return c;
	}
	
	
	public static void main(String[] args) {

//��� ��������, ���� ����� sayHello c����������
//		sayHello();
//		Program.sayHello();
		{
			int a = 40;
			test1(a);
			System.out.println("test1 ������ main a = " + a);
		}
		
		{
			int a[] = {10};
			test2(a);
			System.out.println("test2 ������ main a = " + a[0]);
		}
		
		Program p = new Program();
		p.sayHello();
		p.sayHello("����");
		p.sayHello("����");
		p.sayHello("�����",30);
		double a=average(15,25);
		System.out.println("������� = " + a);
		System.out.println("������� = " + average(10,10));
		//System.out.println(average(new int []{10,20,30,40}));
		System.out.println(average(10,20,30,40));
	
		for(String name: sortNames("����", "���", "����", "����"))
		System.out.println(name);
	}

}
