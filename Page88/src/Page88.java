
public class Page88 {

	//������������ �������������
	//������� ����� ���������� �������������� ������������
	//�� ����� ��� ������� (������� ��������)
	public static void main(String[] args) {
		double a=3.0, b = 4.0;
	
		double c = Math.sqrt(a*a + b*b);
		System.out.println("���������� ����� = " + c);
		

	//������������ ������� �������� ����� ����
	int x = 10;  //��� ���������� �������� ����� ����
	            //�� ������ main()
	
	if (x==10){       //������ ����� ������� ��������,
		int y = 20;   //��������� ������ ����� ����� ����
	
	//��� ���������� x, y �������� � ���� ������� ��������
		System.out.println("x � y: " + x + " " +y);
			x = y * 2;
	}

	//y=100; //������! ���������� y ���������� � ����
	         //������� ��������
	
	System.out.println("� ����� " + x);

	//������������ ����� �������� ����������
	
	for(x=0; x<3; x++){
		int y = -1; //���������� y ���������������� ���
		            //������ ��������� � ���� ����
		System.out.println("y = " + y);
		 y = 100;
		 System.out.println("������ y = " + y);
	}
	
	//������������ ���������� �����
	byte b1;
	int i = 257;
	double d = 323.142;
	System.out.println("i = 254; d = 323.142");
	System.out.println("�������������� ���� int � ��� byte:");
	b1 = (byte) i;
	System.out.println("i � b = " + i + " " + b1);
	
	System.out.println("�������������� ���� double � ��� int:");
	i = (int)d;
	System.out.println("d � i = " + d + " " + i);
	
	System.out.println("�������������� ���� double � ��� byte:");
	b1 = (byte)d;
	System.out.println("d � b = " + d + " " + b1);
	
	
	
}	


}
