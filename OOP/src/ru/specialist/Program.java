package ru.specialist;
import java.util.List;

public class Program {

	public static void main(String[] args) {
			
		//��������� �������� �������� �������
		System.out.println(Person.counter);
		
		Person p = new Person(); //������� ���������� ���� ������ Person
								//� ������� ����������� Person
		p.name = "����";
		p.age = 30;
		
		Person p2 = new Person();
		p2.name = "����";
		p2.age = 31;
		
		System.out.println(p2.name.toUpperCase());	
		
		p.show();
		p2.show();
		
		Person p1 = new Person("����", 5);
		System.out.println(p1);
		System.out.printf("%s - %d\n", p1.name, p1.age);
		p1.show();
		
		Person p4 = new Person("�����");
		p4.show();
		
		//������� ����� ������� �������
		System.out.printf("%d - \n", Person.counter);
		
		Person.showAll();

		Singletone s1 = Singletone.getInstance();
		
	}

}