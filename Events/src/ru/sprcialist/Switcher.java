package ru.sprcialist;

import java.util.*;

public class Switcher {
	//делаем коллекцию Объектов  классов, реализующих интерфейс Electricity
	private List<Electricity> listeners = new ArrayList<Electricity>();

	public void addElectricityListener(Electricity listener){
		//сначала проверяем, есть ли он уже в этой коллекции
		if (!listeners.contains(listener))
			listeners.add(listener);
	}

	public void removeElectricityListener(Electricity listener){
		//сначала проверяем, есть ли он уже в этой коллекции
		if (!listeners.contains(listener))
			listeners.remove(listener);
	}

	public void switchOn(){
		
		for (Electricity listener : listeners )
			listener.onElectricity();
	}
}
