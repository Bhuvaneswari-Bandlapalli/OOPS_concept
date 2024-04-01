package com.methodoverriding;

public class C extends A{
	public double div(int p,int o) {
		double k=p/o;
		System.out.println("C in div: "+k);
		return k;
	}
	public void m1() {
		System.out.println("C in m1");
	}

}
