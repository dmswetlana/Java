//��������� ����������, ���������� ������,
//��������� ���������� ���� long

import static java.lang.System.out;

public class Page79 {

	public static void main(String[] args) {
		int lightspeed;
		long days;
		long second;
		long distance;
		
	//��������������� �������� �����, ���� � �������
		lightspeed=186000;
		
		days = 1000; //������� ���������� ����
		
		second = days * 24 * 60 * 60; //������������� � �������
		
		distance = second * lightspeed; // ��������� ����������
		
		out.print("�� "+days);
		out.print(" ���� ���� ������ ����� " + distance + " ����." );
		

	}

}
