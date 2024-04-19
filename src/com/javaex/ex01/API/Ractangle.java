package com.javaex.ex01.API;

public class Ractangle implements Cloneable{
	
	private int width[];
	private int height[];
	
	public Ractangle(int width[], int height[]){
		super();
		this.width=width;
		this.height=height;
	}
	
	public int[] getWidth() {
		return width;
	}
	public void setWidth(int[] width) {
		this.width = width;
	}
	public int[] getHeight() {
		return height;
	}
	public void setHeight(int[] height) {
		this.height = height;
	}


}
