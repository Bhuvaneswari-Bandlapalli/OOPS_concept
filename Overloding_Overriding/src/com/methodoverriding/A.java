package com.methodoverriding;

public class A {
	public void show() {
		System.out.println("A in  show");
	}
	public int logic(int a,int b) {
		System.out.println("A in  logic: "+(a+b));
		return a+b;
	}
	public String test(String d) {
		System.out.println("A in test: "+d);
		return d;
		
	}
	public double div(int w,int y) {
		double k=w/y;
		System.out.println("A in div: "+k);
		return k;
	}
}
