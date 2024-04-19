package com.javaex.ex01.API;

import java.util.Arrays;

public class Circle implements Cloneable {
	
	//	필드
	private int radius[];
	//	생성자

	public Circle(int[] radius) {
		super();
		this.radius = radius;

	}
	
	//	getters / setters
	public int[] getRadius() {
		return radius;
	}

	public void setRadius(int[] radius) {
		this.radius = radius;
	}
	//	오버라이드
	@Override
	public String toString() {
		return "Circle [radius=" + Arrays.toString(radius) + "]";
	}
	
	//	복제본 생성 메서드
	public Circle getClone() {
		Circle clone = null;
		try {
			clone = (Circle)clone();
		} catch (CloneNotSupportedException e) {
			//	예외로그 출력
			e.printStackTrace();

		}
		return clone;
	}

	protected Object clone() throws CloneNotSupportedException {
		// 깊은 복제를 위해서 내부 참조 데이터를 복제 하여 새로운 참조로 변경

		// 먼저 얕은 복제 시도
		Circle clone = (Circle) super.clone();
//		return super.clone();
		// 내부 참조 객체를 시도( 깊은복제)
		clone.radius = Arrays.copyOf(radius, radius.length);

		return clone; // 만들어진 복제본을 반환
	}
}
