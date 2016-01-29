//вводим температуру по цельсию и преобразуем по фаренгейту
import java.util.Scanner;
import static java.lang.System.out;


public class Temperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		out.print("Введите температуру (С): "); // данные вводятся через запятую (100,5)
		double tc = sc.nextDouble();            //именно в этом методе
		double tf = tc*9/5+32;
		
		out.printf("Температура (F): %.2f\n", tf);
		sc.close();
		
	}

}
