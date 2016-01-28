
public class BasicMath {

	public static void main(String[] args) {
		// основные арифметические операции
		
		int a=0, b, c, d, e;
		System.out.println("a=1+1  " + (a=a+2));
		System.out.println("b=a*3  " + (b=a*3));
		System.out.println("c=b/4  " + (c=b/4));
		System.out.println("d=c-a  " + (d=c-a));
		System.out.println("e=-d   " + (e=-d));
		System.out.println();
		
		//арифметические операции над значениями типа double
		double da, db, dc, dd, de;
		System.out.println("da=1+1   " + (da=1+1));
		System.out.println("db=da*3  " + (db=da*3));
		System.out.println("dc=db/4  " + (dc=db/4));
		System.out.println("dd=dc-a  " + (dd=dc-a));
		System.out.println("de=-dd   " + (de=-dd));
		System.out.println();
		
		//операция деления по модулю % возвращает остаток от деления
		int x=42;
		double y = 42.25;
		
		System.out.println("x=42; y=42.25");
		System.out.println("x%10 =   " + x%10);
		System.out.println("y%10 =   " + y%10);
		System.out.println();
		
		

	}

}
