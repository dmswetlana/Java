//применение конструктора для инициализации переменных


		class Box{
			double width;
			double heigth;
			double depth;
			
			
	//конструктор класса Box
			Box(double w, double h, double d){
				System.out.println("Конструирование объекта Box");
				width = w;
				heigth = h;
				depth = d;
			}
			
			//рассчитаем объём параллелепипеда
			
			double volume() {
				return (width*heigth*depth);
			}			
		}

public class BoxDemo3 {
			public static void main(String[] args) {
				Box mybox1 = new Box(10, 20, 15);
				Box mybox2 = new Box(3, 6, 9);
				
				double vol;
				
				vol = mybox1.volume();
				System.out.println("Объём " + vol);

				vol = mybox2.volume();				
				System.out.println("Объём " + vol);
				
				
				
			}

		}
	
		
		
	