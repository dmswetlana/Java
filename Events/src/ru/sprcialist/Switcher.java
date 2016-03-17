package ru.sprcialist;

import java.util.*;

public class Switcher {
	//������ ��������� ��������  �������, ����������� ��������� Electricity
	private List<Electricity> listeners = new ArrayList<Electricity>();

	public void addElectricityListener(Electricity listener){
		//������� ���������, ���� �� �� ��� � ���� ���������
		if (!listeners.contains(listener))
			listeners.add(listener);
	}

	public void removeElectricityListener(Electricity listener){
		//������� ���������, ���� �� �� ��� � ���� ���������
		if (!listeners.contains(listener))
			listeners.remove(listener);
	}

	public void switchOn(){
		
		for (Electricity listener : listeners )
			listener.onElectricity();
	}
}
