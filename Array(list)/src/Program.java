
import 	java.util.ArrayList;
import java.util.Random;


public class Program {

	public static void main(String[] args) {
		int n = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		 Random generator = new Random(20); 
		 
		for (int i=0; i<10; i++){
			n = generator.nextInt(1000);
		list.add(n);
		}
		
		//печать списка
		for (int i : list)
			System.out.println(i);
	}

}
