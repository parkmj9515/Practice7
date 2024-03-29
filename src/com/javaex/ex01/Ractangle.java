package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	

	//	추상클래스 상속시 내부에 추상메서드는 반드시 구현해야한다
	@Override
	public void draw() {
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");
	}
	
	public int getWidth() {
		return this.width= width;
		
	}
	
	public int getHight() {
		return this.height= height;
	}
		

}


