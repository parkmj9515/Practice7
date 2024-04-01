package com.javaex.ex01.API;

import java.util.Arrays;

public class Circle implements Cloneable{
	
	private int radius[];
	
	public Circle(int radius) {
		super();
		
		
	}
	
	public int[] getRadius() {
		return radius;
	}
	public void setRadius(int[] radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + Arrays.toString(radius) + "]";
	}
	
	public Circle getClone() {
		Circle clone = null;
		try {
			clone = (Circle) clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
			
		}
		return clone;
	}
	
	
}