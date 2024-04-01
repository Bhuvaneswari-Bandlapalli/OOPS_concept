package com.methodoverriding;

public class B extends A {
	public void show() {
		System.out.println("B in  show");
	}
	public int logic(int j,int i ){
		System.out.println("B in  logic: "+(i+j));
		return i+j;
	}
}
