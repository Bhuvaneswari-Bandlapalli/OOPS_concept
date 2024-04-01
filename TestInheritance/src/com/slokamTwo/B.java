package com.slokamTwo;

public class B extends A{
	private final void m1() {
		System.out.println("b m1");//it seems to be like override but private method access with in class
	}
	public static void main(String[] args) {
		B s=new B();
		s.m1();

	}

}
