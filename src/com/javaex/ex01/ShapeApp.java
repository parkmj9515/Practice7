package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape("빨강");			//	추상클래스는 객체화 할수없다
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
		int sr1Width = ((Ractangle)sr1).getWidth();
		System.out.println("sr1의 가로는"+sr1Width+"입니다");
		
	}
}
//	shape s 오류? 파라미터갯수 객체화여부

	
	