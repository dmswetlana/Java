//��������� ����������� ����� ���������� �� ��������
public class TestPage186 {
	int a, b;
	
	TestPage186(int i, int j){
		a = i;
		b = j;
		
	}
	void meth (TestPage186 o) {
		o.a  *= 2;
		o.b /=2;
	}

		public static void main(String[] args) {
		
	TestPage186 ob = new TestPage186(15, 20);
	
	System.out.println("ob.a � ob.b �� ������: " +
	                    ob.a + " " + ob.b);
	ob.meth(ob);
	System.out.println("ob.a � ob.b ����� ������: "
			           + ob.a +  " " + ob.b);

	}
	
}

