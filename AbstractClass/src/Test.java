//класс наследник от TestBase
//здесь обязаны переопределить методы абстрактного класса
//либо этот класс тоже будет абстрактным

public class Test extends TestBase {

	@Override
	public void show() {
		System.out.println("Test");
		
	}
}
