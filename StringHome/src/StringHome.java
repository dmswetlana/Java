import java.util.Scanner;

public class StringHome {
	
		
	public static void main(String[] args) {
		Scanner	 sc = new Scanner(System.in);
		
		System.out.println("Введите строку для проверки: ");
		String stroka = sc.nextLine();
		System.out.println("Вы ввели строку: " + stroka);
		System.out.println("Длина строки = " + stroka.length());
// вводим строку в массив
		int massiv[] = new int[65536];
		for (int i=0; i<stroka.length(); i++)
		{
			massiv[stroka.charAt(i)]++;
			System.out.println(i + " символ = " + massiv[stroka.charAt(i)] );		
		}

//выводим  символы
		for (int i=0; i<255; i++)
			if (massiv[i]>0)
			{
				System.out.println((char)i + " встречается " + massiv[i] + " раз");
			}
		
	}

}