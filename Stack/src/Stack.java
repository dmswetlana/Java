//� ���� ������ ������������ ������������� ����, � �������
//����� ������� �� 10 ������������� ��������

public class Stack {

	int stck [] = new int [10];
		int tos; 
		
		//�������������� ������� �����
		Stack(){
			tos = -1;
		}
		
		//���������� ������� � �����
		void push (int team){
			if (tos==9)
				System.out.println("���� ��������");
			else
				stck[++tos] = team;
		}
		
		//������� ������� �� �����
		int pop (){
			if (tos<0)
			{
				System.out.println("���� ������");
				return 0;
			}
			else 
				return stck[tos--];
		}
		
		
	public static void main(String[] args) {
		
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		
		//���������� ����� � �����
		for (int i=0; i<10; i++)
		{
			mystack1.push(i);
			System.out.print(" " + i );
		}
			System.out.println();
		
		for (int i=10; i<20; i++)
		{
			mystack2.push(i);
			System.out.print(" " + i);
		}
		System.out.println();
		
		//��������� ��� ����� �� �����
		System.out.println("���������� ����� 1:");
		for(int i=0; i<10; i++)
			System.out.print(mystack1.pop()+ " ");
		System.out.println();
		
		System.out.println("���������� ����� 2:");
		for (int i =0; i<10; i++)
			System.out.print(mystack2.pop() + " ");
		System.out.println();
		
				
		
			
		
		
		
				
		
	}

}
