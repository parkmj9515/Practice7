package com.javaex.ex02;

public class Duck extends Bird {
	
	@Override
    public void sing() {
    	System.out.println("오리("+(super.getName())+")가소리내어 웁니다");
    }	
	@Override
    public void fly() {
    	System.out.println("오리("+super.getName()+")가날지 않습니다");
    }
    @Override
    public void showName() {
    	System.out.println("오리의 이름은 "+super.getName()+"입니다");
    }

}
