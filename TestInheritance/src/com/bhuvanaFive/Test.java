package com.bhuvanaFive;

public class Test {

	public static void main(String[] args) {
		Three t=new Three();
		t.m4();
		t.m1();
		t.m2();
		System.out.println("=============");
		Two t1=new Two();
		t1.m4();
		t1.m1();
		t1.m2();
		System.out.println("==================");
		One t2=new One();
		t2.m4();
	System.out.println("+=================");
		One t3=new Two();
		t3.m4();
		System.out.println("--------------------");
		Two t4=new Three();
		t4.m1();
		t4.m2();
		t4.m4();
		System.out.println("==============");
		One t5=new Three();
		t5.m4();

	}

}
