package ru.sprcialist;

public class TVSet implements Electricity {

	@Override
	public void onElectricity() {
		System.out.println("Телевизор заработал");
		
	}
	
}
