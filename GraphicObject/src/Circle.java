// класс Окружность 

public class Circle extends GraphObject{
	public Point center; // центр окружности - точка
	public int radius; //радиус
	
	
	public Circle(int x, int y,int radius, String color){
		this(new Point(x,y,color), radius, color);
	}
	
	public Circle(int x, int y,int radius){
		this(x,y,radius,DEFAULT_COLOR);
	}
	
	public Circle(Point center, int radius, String color) {
		super(color);
		this.center = center.clone();
		this.radius = radius;
	}
	
	public Circle(Point center, int radius) {
		
		this(center, radius, DEFAULT_COLOR);
	}
	
	@Override
	public String toString() {
		
		return String.format("Circle (%d, %d) R: %d Color: %s",
				center.x, center.y, radius, color);
	}
	@Override
	public void draw() {
	
	System.out.println(this.toString());
	}
	
	@Override
	public Circle  clone() {
		
		return new Circle(center, radius,color);
	}
}
