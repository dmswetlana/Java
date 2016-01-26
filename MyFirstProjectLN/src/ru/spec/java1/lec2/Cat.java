package ru.spec.java1.lec2;

public class Cat {

	private String name;
	private long age;
	private Cat parent;
	private boolean del;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return (int)age;
	}
	public long getLongAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public Cat getParent() {
		return parent;
	}
	public void setParent(Cat parent) {
		this.parent = parent;
	}
	public boolean isDel() {
		return del;
	}
	public void setDel(boolean del) {
		this.del = del;
	}
	
}
