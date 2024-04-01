package com.methodoverriding;

public class Test {
	public static void main(String[] args) {
		A a=new A();
		a.div(12, 13);
		a.show();
		a.test("bhuvana");
		a.logic(12,89);
		B b=new B();
		b.show();
		b.logic(23,8);
		C c=new C();
		c.m1();
		c.div(34,8);
		System.out.println("-------------------------");
		A ab=new C();
		ab.show();
		ab.logic(67,9);
	}

}
