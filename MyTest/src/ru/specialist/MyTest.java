
package ru.specialist;

public class MyTest {

	//������ Nested ����� - ��������� �����
	// ����� �������� ����� static  � �� �������
	// �� ���������a �������� ������
	public static class MyNested
	{
		public String NestedField = "Nested class";
		
		public void nestedShow()
		{
			System.out.println(NestedField);
		}
	}
	
	
	//������ Inner ����� - ��������� �����
	// �� ����� �������� ����� static  � �������
	// �� ���������a �������� ������
		public  class MyInner
		{
			public String InnerField = "Inner class";
			
			public void innerShow()
			{
				System.out.println(InnerField);
			}
		}
		
	
	public String outerField = "Test class (outer)";
	public void show()
	{
		System.out.println(outerField);
	}
	
	//������ ����� Bank � ��� inner ����� � � ��� ��������
	
	
	
}
