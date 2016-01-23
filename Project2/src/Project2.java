/*короткий пример программы
*/
public class Project2 {

	public static void main(String[] args) {
		int num;
		num = 70;
		System.out.println("This variable num: " + num);
		num = num * 2;
		
		System.out.print("num * 2 = " + num);
		System.out.println(" ");
		
		if (num<500) 
		System.out.println("num<500 ");
		
		int x, y;
		x=10; y=20;
		
		if(x<y) System.out.println("x < y");
		
		x = x *2;
		if(x==y) System.out.println("now x = y");
		
		x = x*2;
		if(x>y) System.out.println("now x > y");
	
		if (x==y) System.out.println("you don't see that");

		x=10;
		for(x=0; x<10; x++)
		System.out.println("x = " + x);
	
	}

}
