//создаём класс Треугольник, наследник от GraphObject
package ru.specialist.ext;

import ru.specialist.graph.GraphObject;

public class Triangle extends GraphObject {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Triangle color: %s ", this.color);
	}
	
}
