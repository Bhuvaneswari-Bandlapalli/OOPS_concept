package com.methodoverloading;

public class Calculater {
	public static void add(int a,int b) {
		System.out.println("addition: "+(a+b));
	}
	public static int add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("addition 1: "+d);
		return d;
	}
	public double add(double t,double u) {
		double r=t+u;
		System.out.println("addition 2: " +r);
		return r;
	}
	public void add() {
		System.out.println("addition");
	}
	

}
