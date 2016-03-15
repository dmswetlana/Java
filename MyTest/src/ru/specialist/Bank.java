package ru.specialist;

public class Bank {
private String nameBank; // название банка
public String innBank;  //ИНН банка

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


public class Account //Inner класс
 		{
	 		private  long number; //номер счета
 		    private double balance; //баланс
			
 		    public long getNumber() {
				return number;
			}
			
 		    public double getBalance() {
				return balance;
			}
 	//конструктор для задания номера счёта
 		    public Account (long number)
 		    {
 		    	this.number = number;
 		    }
 		
 	//положить сумму на счёт
 		    public void Deposit (double summa){
 		    	balance += summa;
 		    }
 		
 	//снять деньги со счёта
 		    public boolean Withdraw(double summa){
 		    	if (balance<summa)
 		    		return false;
 		    	balance -=summa;
 		    	return true;
 		    				
 		    }
 		
 		 //печатаем имя банка, счёт и сумму
 		   public void show(){
 			   System.out.printf("%s %d %g",
 					   nameBank, getNumber(), getBalance());
 		   }
 		    
 		    
 		}


}
