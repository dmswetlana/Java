package ru.specialist;


public class Main {

	public static void main(String[] args) {
		MyTest test = new MyTest();
		test.show();

		MyTest.MyNested nested =  new MyTest.MyNested();
		
		nested.nestedShow();
		
		MyTest.MyInner inner = test.new MyInner();
		inner.innerShow();
		
		
		Bank bank = new Bank("��������"); //������� �����������
		//������ ������ �������� ������ � ����� ����
		//�������� � inner �������
		Bank.Account accl = bank.new Account(123); //123-����� �����
		accl.Deposit(100);
		accl.show();
				
		
	}

}