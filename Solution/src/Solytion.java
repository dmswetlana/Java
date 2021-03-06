/* ��������� � 10
����������� ����� closeToTen. ����� ������ �������� �� 
����� ��������� � 10 �� ���� �����, ���������� � ���������� ������.
��������, ����� ����� 8 � 11 ��������� � ������ 11. ���� ��� ����� 
�� ������ ����� � 10, �� ������� �� ����� ����� �� ���.
���������:  ����������� ����� public static int abs(int a), 
������� ���������� ���������� �������� �����.
*/


/* ��������
����������� ����� checkInterval. ����� ������ ��������� ������ ��
 ����� ����� � �������� �� 50 �� 100
� �������� ��������� �� ����� � ��������� ����: "����� � �� 
���������� � ���������." ��� "����� � ���������� � ���������.",
���  � - �������� ������.
������ ��� ����� 112:
����� 112 �� ���������� � ���������.
������ ��� ����� 60:
����� 60 ���������� � ���������.
*/

/* ����� ����
����������� ����� checkSeason. �� ������ ������, 
����� ������ ���������� ����� ���� (����, �����, ����, �����) �
 ������� �� �����.
������ ��� ������ ������ 2:
����
������ ��� ������ ������ 5:
�����
*/

/* ������������� � ������������� �����
������ � ���������� �����. ���� ����� �������������, �� 
��������� ��� � ��� ����. ���� ����� �������������, �� ��������� �������.
������� ��������� �� �����.
*/

/* ���� ������
������ � ���������� ����� ��� ������, � ����������� �� ������
 ������� �������� ������������, ��������, ������, ��������, 
 ��������, ��������, ������������,
���� ������ ����� ������ ��� ������ 7 � ������� 
������� ��� ������ �� ����������.
������ ��� ������ 5:
�������
������ ��� ������ 10:
������ ��� ������ �� ����������
*/

import java.io.*;

public class Solytion
{
    public static void main(String[] args)throws IOException
    {
        closeToTen(8,11); //��������� � 10
        closeToTen(14,7);
        closeToTen(25,1);
        closeToTen(7,7);
        
        checkInterval(60); //��������
        checkInterval(112);
        
        checkSeason(12); //����� ����
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        
        {  // ������������� � ������������� �����
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 String s = reader.readLine();
        int x = Integer.parseInt(s);
        if (x>0) System.out.println(x*2);
        else System.out.println(x+1);
        }
        
        
        {//���� ������
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        
        if (x==1) System.out.println("�����������");
        if (x==2) System.out.println("�������");
        if (x==3) System.out.println("�����");
        if (x==4) System.out.println("�������");
        if (x==5) System.out.println("�������");
        if (x==6) System.out.println("�������");
        if (x==7) System.out.println("�����������");
        if (x<1 || x>7)
        System.out.println("������ ��� ������ �� ����������");
        
        }
        
        
    }
    
    
  


	public static void checkSeason(int mount){
    	if(mount>=3 & mount <=5)
    		System.out.println("�����");
    	if(mount>=6 & mount <=8)
    		System.out.println("����");
    	if(mount>=9 & mount <=11)
    		System.out.println("�����");
    	if(mount>=1 & mount <=2 )
        System.out.println("����");
    	if(mount==12)
            System.out.println("����");
    }
    
    public static void checkInterval(int a){
    	if(a>=50 & a<=100)
        System.out.printf("\"����� %d ���������� � ���������.\"\n", a);
    	
    	else
    	System.out.printf("\"����� %d �� ���������� � ���������.\"\n", a);	
    }
    
    public static void closeToTen(int a, int b)
    {
    	if (abs(10-a)> abs(10-b))
    		System.out.println(b);
    	if (abs(10-a)< abs(10-b))
    		System.out.println(a);
    	if (abs(10-a)== abs(10-b))
    		System.out.println(b);
    	
    	
    }

    public static int abs(int a)
    {
        if (a < 0) {
            return -a;
        } else 
        {
            return a;
        }
    }
}
