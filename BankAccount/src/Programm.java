//создаём класс клиент банка
//списываем со счёта клиента сумму на другой счёт
public class Programm {

	public static void main(String[] args) {
		
		
		BankAccount b1 = new BankAccount("Name1", 1000);
		BankAccount b2 = new BankAccount("Name2");
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		b1.deposit(500);
		System.out.println(b1);
		System.out.println(b2);
		
		b1.withdraw(2000);
		System.out.println(b1);
		System.out.println(b2);
		
				
		BankAccount.transfer(b1, b2, 1200);
		System.out.println(b1);
		System.out.println(b2);
		
		

	}

}
