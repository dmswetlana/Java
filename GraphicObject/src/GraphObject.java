//базовый класс унаследован от Object
public class GraphObject {
	
	public static final String DEFAULT_COLOR = "Black";
	public String color;

	
		
	public void draw(){
		System.out.printf("GraphObject %s \n", color);
	}
	
	public GraphObject(){
		this(DEFAULT_COLOR);
		System.out.println("GraphObject() ctor");
		
	}
	
	public GraphObject (String color){
		System.out.println("GraphObject(color) ctor");
		this.color = color;
	}
	
	
}
