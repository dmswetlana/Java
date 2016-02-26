
public class Program {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		
		System.out.println("факториал 4 = " + f.fact(4));
		
		System.out.println("факториал 5 = " + f.fact(5));
	

	RecTest ob = new RecTest(10);
	int i;
	for (i=0; i<10; i++) ob.values[i]=i;
	
	ob.printArray(10);
	
}
}
