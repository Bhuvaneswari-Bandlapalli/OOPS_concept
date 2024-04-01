package com.slokam;

public class One  {
	public void m1() {
		System.out.println("One m1 method");
	}
	public static void main(String[] args) {
		Reg o=new Reg();
			o.m1();
			o.m2();
			o.m3();
			System.out.println(o.k);
			System.out.println(o.n);

	}

}
