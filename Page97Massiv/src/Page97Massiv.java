
public class Page97Massiv {

	public static void main(String[] args) {
		// применение одномерного массива
		
		int month_days[];
		month_days= new int[12];
		month_days[0]=31;
		month_days[1]=28;
		month_days[2]=31;
		month_days[3]=30;
		month_days[4]=31;
		month_days[5]=30;
		month_days[6]=31;
		month_days[7]=31;
		month_days[8]=30;
		month_days[9]=31;
		month_days[10]=30;
		month_days[11]=31;
		
		System.out.println("¬ апреле " + month_days[3] + " дней");
		
		//усовершенствованна€ верси€ программы
		
		int month_days2[] = {31, 28 , 31, 30, 31, 30, 31, 31,
				        30, 31, 30, 31};
		System.out.println("¬ марте " + month_days2[2] + " день");
		
		
		//вычислим среднее значение р€да чисел
		double nums[] = {10.0, 11.2, 12.3, 13.4, 14.5};
		double result = 0;
		int i;
		
		for (i=0; i<5; i++)
			result += nums[i];
			System.out.println("—реднее значение = " + result/5);
	
		
	}	

	}

