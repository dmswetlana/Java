package ru.specialist.graph;

import java.util.*;

//базовый класс унаследован от Object
/**
 * @author PC
 *
 */
public class GraphObject {
	
	public static final String DEFAULT_COLOR = "Black";
	
	private static List<GraphObject> scene = new ArrayList<GraphObject>();
	
	
	protected String color;

	public String getColor(){
		return color;
	}
	
	@Override
	public String toString() {
		
		return String.format("GraphObject %s \n", color);
	}
	
	public void draw(){
		System.out.println(this);
	}
	
	public GraphObject(){
		this(DEFAULT_COLOR);
		System.out.println("GraphObject() ctor");
		
	}
	
	public GraphObject (String color){
		System.out.println("GraphObject(color) ctor");
		this.color = color;
		scene.add(this);
	}
	
	public static void drawScene(){
	System.out.println("******************************");
		for (GraphObject g : scene)
		g.draw();
	}

	//метод масштабирования всей сцены
	public static void scaleScene(double factor){
		for(GraphObject g : scene)
		{
			if (g instanceof Scaleable)
			{
				Scaleable c = (Scaleable)g;	
				c.scale(factor);
			}
		}
		
	}
	
	//метод перемещения сцены movie
	
	public static void movieScene(int dx, int dy){
		for(GraphObject g : scene)
		{
			if (g instanceof Movieable)
			{
				Movieable c = (Movieable)g;	
				c.movie(dx,dy);
			}
		}
		
	}
}
