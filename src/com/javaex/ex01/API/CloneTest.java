package com.javaex.ex01.API;

public class CloneTest {

	public static void main(String[] args) {
		
		Circle[] c1 = new Circle[(30)];
		System.out.println("c1=?"+c1);
		
		
		Circle[] c2 = c1.clone();
		System.out.println("c1==c2?" +(c1 == c2));
	}

}
