package com.inheritance.singlelevel;

public class AdvCalc extends Calculator {
	public void sub(int a,int b) {
		System.out.println("subtraction: "+(a-b));
	}
	public int multi(int e,int h) {
		int c=e*h;
		System.out.println("multiplication: "+(e*h));
		return c;
	}
	public double div(int d,int f) {
		double k=d/f;
		System.out.println("division: "+k);
		return k;
	}
	public int madulo(int f,int o) {
		int h=f%o;
		System.out.println("Madulo: "+(f%o));
		return h;
	}

}
