//класс, реализующий интерфейс Electricity
package ru.sprcialist;

public class Lamp implements Electricity{

	@Override
	public void onElectricity() {
		System.out.println("Лампа зажглась");
		
	}
	

}
