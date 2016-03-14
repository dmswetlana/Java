package ru.specialist.graph;
/*
  уровни доступа для класса:
  уровень доступа	модификатор		видимость 
  access level		modifier		visibility
     public          public            world
     package                           внутри пакета
     
     package включается,  если не пишем никакого модификатора
 */


/*
уровни доступа для полей:
уровень доступа	модификатор		видимость 
access level		modifier		visibility
   public          public            world
   package                           внутри пакета
   protected       protected        this+inherit+package  
   private         private          this class    	   
     
   package включается,  если не пишем никакого модификатора
*/

//создаём класс от GraphObject

public class Point extends GraphObject implements Cloneable {

	int x=0;
	int y=0;
	
	public String color="green";
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y, String color){
		super(color);
		System.out.println("Point(x,y,color) ctor");
		this.x = x;
		this.y = y;
		//this.color = color;
	}
	
	public Point(int x, int y){
		this(x,y, DEFAULT_COLOR);
		System.out.println("Point(x,y) ctor");
	}
	
	public Point(){
		this(0,0, DEFAULT_COLOR);
		System.out.println("Point() ctor");
		
	}
	public void move (int dx, int dy){
		 this.x = this.x+dx; //x +=dx;
		 this.y = this.y+dy; //y +=dy;
		 System.out.printf("x+dx = %d; y+dy = %d \n", x, y);
	}
	
	//переопределим метод родительского класса
	@Override
	public void draw(){
		System.out.println(this);
		super.draw();//вызвали метод родительского класса
		
	}
	
	@Override
	public String toString() {
		
		return String.format("Point (%d,%d) %s", x, y, super.color);
	}
	
	@Override
	public Point clone(){
		
		return new Point(x,y,color);
	}
}