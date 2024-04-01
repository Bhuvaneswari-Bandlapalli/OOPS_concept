package com.methodoverloading;

public class Main {

	public static void main(String[] args) {
		Calculater.add(23,89);
		Calculater.add(23, 67, 90);
		Calculater c=new Calculater();
		c.add(34.9, 56.0);
		c.add();		

	}

}
