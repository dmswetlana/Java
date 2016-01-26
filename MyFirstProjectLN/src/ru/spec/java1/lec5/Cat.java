package ru.spec.java1.lec5;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Cat implements Serializable,Cloneable{
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private int count;
	private Date time;
	private BigDecimal hash;
	private Cat parent;
	
	@Override
	public Cat clone() throws CloneNotSupportedException {
		return (Cat) super.clone();
	}
	
	@Override
	public String toString() {
		
		return "Cat [name=" + name + ", count=" + count + ", time=" + time + ", hash=" + hash + "]";
	}
	void f(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public BigDecimal getHash() {
		return hash;
	}
	public void setHash(BigDecimal hash) {
		this.hash = hash;
	}
	public Cat getParent() {
		return parent;
	}
	public void setParent(Cat parent) {
		this.parent = parent;
	}
	
}
