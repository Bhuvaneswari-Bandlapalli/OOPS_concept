package com.slokamThree;

public class A {
	private final void m1(int a,int b) {
		System.out.println(a+"==="+b);
	}
	private final void m1(String uName,String pasw) {
		System.out.println(uName+"==="+pasw);
	}
	public static void main(String[] args) {
		A s=new A();
		s.m1(1, 2);
		s.m1("mnmjh","kjygf");
	}

}
