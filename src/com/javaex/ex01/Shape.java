package com.javaex.ex01;

public abstract class Shape {			// abstract는 객체화 안됌
	
	protected String fillColor;
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	
	public abstract void draw();
	
}


