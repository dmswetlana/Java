//����� ��� ������� �����

public class BankAccount {

	private String owner; //�������� �����
	private double amount; //����� �����
	
	public String getOwner() {
		return owner;
	}
	
	
	public double getAmount() {
		return amount;
	}


	public BankAccount(String owner) {
		
		this(owner, 0D);
	}


	public BankAccount(String owner, double amount) {
		super();
		this.owner = owner;
		this.amount = amount;
	}
	
	
	public void deposit (double summa){
		this.amount += summa;
	}
	
	public boolean withdraw(double summa){
		if (this.amount >= summa)
		{
			this.amount -=summa;
			return true;
		}
		else return false;
	}

@Override
 public String toString()
 {
	 return String.format("%s : %.2f", 
			 this.getOwner(), this.getAmount());
 }
 

public static boolean transfer(BankAccount source,
				BankAccount target, double summa){
	if (source.withdraw(summa)) //��������� ����� � �������
	{
		target.deposit(summa); //���������� �� ���� ����������
		return true;
	}
	else return false;
	
}


	}
	
	
