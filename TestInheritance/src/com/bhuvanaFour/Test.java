package com.bhuvanaFour;

public class Test {
	
	public static void main(String[] args) {
		C c=new C();
		c.m1();
		c.m5();
		c.m8();
		c.m2();
		c.m3();
		c.m4();
		c.m6();
		System.out.println("=====================");
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		b.m6();
		System.out.println("+++++++++++++++++++++++++");
		A a=new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		System.out.println("========================");
		A d=new C();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		System.out.println("==============");
		A e=new B();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		System.out.println("===============");
		B k=new C();
		k.m1();
		k.m2();
		k.m3();
		k.m4();
		k.m5();
		k.m6();
		
	}

}
