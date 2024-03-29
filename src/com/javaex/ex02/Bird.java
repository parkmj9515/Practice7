package com.javaex.ex02;

public abstract class Bird {
    private String name;	//	protected String name;

    public Bird() {			//	protected String getName() 
    						//	protected void setName(String name)
    }								//this.name = name;
    						//	Duck Sparrow 가 공통적으로 가진 메서드의 설계를 추상메서드로 분리
    public Bird(String name) {		
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    
    public void showInfo() {
    	System.out.println();
    }

    public abstract void sing(); 
    public abstract void fly();    
	public abstract void showName() ;
	
		
	
}
