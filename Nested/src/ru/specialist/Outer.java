//������� ������� �����
package ru.specialist;

public class Outer {

	public static class Nested{
		public void updateOuterData(Outer o){
			o.data++;
		}
	}
	
	public class Inner{
		public void updateOuterData(){
			data++;
		}
	}
	private int data = 0;

	
	//�����������
	public Outer(int data) {
		super();
		this.data = data;
		Nested n;
	}

	public static MOperator l;
	public static MOperator l2;
	
	public int getData() {
		final int k=2;
		
		class Local implements MOperator
		{
			public void multiple()
			{
				data *=k;
			}
			
		}
		l = new Local();
		//l.multiple();
	l2=new MOperator() //��������� ������
	{
		public void multiple()
		{
			data *=k;
		}
	
	};
	
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}