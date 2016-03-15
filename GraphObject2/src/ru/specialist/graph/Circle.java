package ru.specialist.graph;

//класс Окружность 

public class Circle extends GraphObject implements Scaleable

{
	protected Point center; // центр окружности - точка
	protected int radius; //радиус
	
	public int getX(){
		return center.x;
	}
	
	public int getY(){
		return center.y;
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius>0) 
		this.radius = radius;
	}

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
//метод масштабирования
@Override
	public void scale(double factor){
		setRadius((int)(radius*factor));
	}



}
