package ru.specialist;

public class Bank {
private String nameBank; // �������� �����
public String innBank;  //��� �����

 public String getNameBank() {
	return nameBank;
}

public Bank(String nameBank) {
	super();
	this.nameBank = nameBank;
}


public String getInnBank() {
	return innBank;
}


public class Account //Inner �����
 		{
	 		private  long number; //����� �����
 		    private double balance; //������
			
 		    public long getNumber() {
				return number;
			}
			
 		    public double getBalance() {
				return balance;
			}
 	//����������� ��� ������� ������ �����
 		    public Account (long number)
 		    {
 		    	this.number = number;
 		    }
 		
 	//�������� ����� �� ����
 		    public void Deposit (double summa){
 		    	balance += summa;
 		    }
 		
 	//����� ������ �� �����
 		    public boolean Withdraw(double summa){
 		    	if (balance<summa)
 		    		return false;
 		    	balance -=summa;
 		    	return true;
 		    				
 		    }
 		
 		 //�������� ��� �����, ���� � �����
 		   public void show(){
 			   System.out.printf("%s %d %g",
 					   nameBank, getNumber(), getBalance());
 		   }
 		    
 		    
 		}


}
