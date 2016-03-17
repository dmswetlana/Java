package ru.sprcialist;

public class Program {

	public static void main(String[] args) {
		
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
		TVSet tv = new TVSet();
	
		//подписываемся на событие у Switcher, передавая ему
		//в качестве параметра сначала лампу, потом ТV

		sw.addElectricityListener(lamp);
		sw.addElectricityListener(tv);
		
		//делаем обработчик с помощью анонимного класса
		sw.addElectricityListener(
				new Electricity()
				{
				public void onElectricity(){
					System.out.println("ПОЖАР!");
				}
				}
			);
		
		sw.switchOn();
	}

}
