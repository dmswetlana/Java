package ru.sprcialist;

public class Program {

	public static void main(String[] args) {
		
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
		TVSet tv = new TVSet();
	
		//������������� �� ������� � Switcher, ��������� ���
		//� �������� ��������� ������� �����, ����� �V

		sw.addElectricityListener(lamp);
		sw.addElectricityListener(tv);
		
		//������ ���������� � ������� ���������� ������
		sw.addElectricityListener(
				new Electricity()
				{
				public void onElectricity(){
					System.out.println("�����!");
				}
				}
			);
		
		sw.switchOn();
	}

}
