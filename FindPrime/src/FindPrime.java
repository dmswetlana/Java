//��������� ������� ����� ��� ���

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		{
		int num; //����� ��� ��������
		boolean isPrime;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ��� ��������: ");
		num = sc.nextInt();
		
		if (num<2) isPrime = false;
		else isPrime = true;
		
		for (int i =2; i<=num/i; i++)
		{
			if((num%i)==0)
			{
				isPrime = false;
				break;
			}
		}
		
		if (isPrime)
			System.out.println("����� " + num + " �������.");
		else
			System.out.println("����� " + num + " �� �������.");
		}
		
		{//����� for  � for each
			
			int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int sum = 0;
			int i;
			
			for(i=0; i<10; i++)
				sum += nums[i];
			
			System.out.println("����� = "+ sum);
			
			sum = 0; 
			for (int x : nums){
				System.out.println("�������� �����: " + x);
				sum +=x;}
			
			System.out.println("����� = "+ sum);
			
			
			sum = 0; 
			for (int x : nums){
				System.out.println("�������� �����: " + x);
				sum +=x;
			if (x==5) break; //�������� ���� ����� ��������� 5 ��������	
			}
			
			System.out.println("����� ������ ���� ��������� = "+ sum);		
		}
		
		{//���������� ����� for � ����� for each
		 //��� ��������� � ����������� �������
			
			int sum=0;
			int nums[][] = new int [3][5];
			
			//��������� ������� ��������� ������� nums
			for (int i=0; i<3; i++)
				for (int j=0; j<5; j++)
					nums[i][j]= (i+1)*(j+1);
			
			//���������� for each ��� ������ � ������������ ��������
			for(int x[] : nums) {
				for(int y : x){
					System.out.print(" " + y );
					sum +=y;
				}
				System.out.println();
			}
				System.out.println("����� ������� = "+sum);					
		}
		
		{//����� � ������� � ����������� for each
					
			Scanner sc = new Scanner(System.in);
			int mass[] = {25, 14, 8, 32, 100, 7, 1, 15};
			int val;
			boolean perem = false;
			
			System.out.println("����� ����� ����? ");
			val = sc.nextInt();
			
			for (int x : mass){
				if (x==val){
					perem = true;
					break;
				}
			}
			if (perem) System.out.println("�������� �������!");
			else System.out.println("������ ����� � ������� ���!");
		}
				
	}

}
