
//���������� �������
public class OverloadDemo {

	void test(){
		System.out.println("��������� �����������");
	}
	
	//������������� �����, ����������� �������
	//������ �������������� ���������
	void test(int a){
		System.out.println("a: " + a);
	}
	
	//������������� �����, ����������� �������
	//���� ������������� ����������
		void test(int a, int b){
			System.out.println("a � b : " + a + " " + b);
		}
		
		
	//������������� �����, ����������� �������
	//��������� ���� double
		double test (double a){
			System.out.println("double a: " + a);
			return a*a;
		}
}

	class Overload{
	public static void main(String[] args) {
	
		OverloadDemo ob = new OverloadDemo();
		double result;
		
		//�������� ��� �������� ������ test()
		
		ob.test();
		ob.test(5);
		ob.test(10,15);
		result = ob.test(123.25);
		System.out.println("double 123.25 " + result);

	}

}
