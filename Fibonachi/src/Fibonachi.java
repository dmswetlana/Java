//����� ��������� - �������� ������������������, � �������
//������ ����������� ����� ����� ����� ���� ���������� �����.
//F(0)=0, F(1)=1, F(n)=F(n-1) + F(n-2)
//�� ���� ������ � ������ ����� ������ �������

public class Fibonachi {
	
	public static void main(String[] arg){

	int N =20; // ������������������ �� 20 �����
	int num1=1;
	int num2=1;//������ ��� ����� ����� �������
	int Fibonachi=0;

	int i=2; //������� ��� �����
	
	System.out.print(num1 + " " + num2); //������ ������ ���� ���������
		
	while (i<N){
		Fibonachi=num1+num2;
		num1 = num2;
		num2 = Fibonachi;
		System.out.print(" " + Fibonachi);
		i++;}
	}

	//������ ������� 
	
	
}
