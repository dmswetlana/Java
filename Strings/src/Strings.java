// ������ � java ������������ ����� ������

import static java.lang.System.out;
//������� ������ ����������� ������� �����,
//��������: import java.util.Date; (����������� ����� Date)
// ����������� ������ ����������� ���� ��� ����� ������
//������� ����������� ������ ���� � ������������ ���� out
// import static java.lang.System.out;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
//���������� ����� Scanner ��� ����� � �������.
//�� ��������� �������� � ����� ������� � ������ ���������
//������, �������� ������.

import java.util.Date;

public class Strings {

	public static void main(String[] args)throws IOException { 
	{	
		String s1 = "������"; //� s1 ���������� ����� ������
		String s2 = new String("������");
		
		//������� ������ ������ �������� �������������
	
		char ch = s1.charAt(0); //���� ����� ��������� �������� ������ ������
		                       //�� ��� ����������� ������
		out.println(s1);
		out.println(ch);
		
		String hello = "������";
		String name = "������";
		String result = hello + " " + name.toUpperCase(); 
		//����� toUpperCase() ��������� ������ � ������� ������� 
		
		out.println(result);
	}
/*	{
		//��������� ������ �� 100 ����� ����� ������
		//��� ������� BAD, ��� ������ �� �����
		//�������� � ������ 302 ������� ������ String
		// �������� ��������
		String r = ""; //������� ������ ������
		for (int i=1; i<=100; i++)
		r = r + String.valueOf(i) + " "; //����� i ��������� � ������
		out.println(r);
		
		
		StringBuilder sb = new StringBuilder(); //���� ����� StringBuilder �� ������ 
		                                        //� ������ ����� �������, � ��������
		                                        //������������
		for (int i=1; i<=100; i++)
			sb.append(i).append(" "); //����� append ���������� ������ �� ���� �� ������
			
		//��������� �������� �� String a StringBuilger, �������
		//������� toString ������ ��������������� � String
			String r = sb.toString();
			out.println(sb);
	*/	{	
		//���������� ���� � �������
			Scanner sc = new Scanner(System.in);
			out.print("������� ������: ");
			String s = sc.nextLine(); //����� nextLine ���������� ������,
			                          //�������� � �������
			out.println(s);
			
		//���������� ��������� �����
			String s3="Sergey";
			boolean rs = (s == s3); //������������ ������, � �� ��������
			out.println(rs);
	
				
		//� java ������ ������������� ������� equals
			
			boolean rs1 = (s.equals(s3)); //������������ ���������� �����
			out.println(rs1);		
			}
		{
		String s1 = "������"; //� ������ ����� ���� ������. ���������� ��������������.
		String s2 = "������"; //����� ��� ������� �������� ���������� ������
		
		boolean r = (s1 == s2);
		out.println(r);
		
		String s3 = new String ("������"); //����� ��������� ��� �������
		String s4 = "������";              //new ������ ������ ����� ������
		                                   //������ �������� ������
		r = (s3 == s4);
		out.println(r);
		
		String s5 = "������";           //������ ����� �����
		String s6 = "���" + "���";      //������ ����� ����, ��� � ������ ������
		r = (s5 == s6);
		out.println(r);
		
		String s7 = "������";        //������ �� ����� �����
		String s8 = "���";           //���������� ����������� ��������� �� �����.
		String s9 = "���" + s8;      //� ��������� ���� �� ������ ��������, �� � ����������
		r = (s7 == s9);
		out.println(r);
		
		}
	
		{
			//����� � �������
			int a=5;
			int b=7;
			
			out.printf("\"a\"= %d\nb= %d\n", a, b);
			 double d=25;
			 double d2=1.5;
			 
			 out.printf("d= %2$10.2f\nd2=%1$f\n", d2, d/2);
			 //������� �������� ������ ��������, ����� ������
			 
			Date now = new Date();
			out.printf("%1$tY-%1$tB-%1$td\n", now); 			
		}
	
		{
			//���� ������ � �������
			//����� BufferedReader ������ ������ ������ 
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			out.println("������� ������: ");
			String s = reader.readLine();
			 out.println(s);
			 
			 //��� ����� �������� �������� ����� � ��� �����
			 //�������� ������ � ������������� � ��� ������� parseInt
			 //���� ������������ ������ ��, ��� ������ �� �������,
			 //������ ����� ����� ������
			 
			 int x = Integer.parseInt(s);
			 out.println(x);
			 
			//����� ������������ ����� Scanner
			 Scanner sc = new Scanner(System.in);
			out.println("������� ��� �����:");
			int x1 =  sc.nextInt();
			int x2 = sc.nextInt();
			out.printf("x1=%d\nx2=%d\n", x1, x2);
			
			//����� ������ � ������� next, ��������� ���
			sc.close();
			
			
		}
		
	}
}
