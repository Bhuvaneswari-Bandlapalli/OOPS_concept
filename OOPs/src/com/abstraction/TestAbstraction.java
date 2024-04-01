package com.abstraction;

public class TestAbstraction {

	public static void main(String[] args) {
		
		Addition a=new Addition();
		a.operations("addition");
		a.calc(5, 6);
		Subtraction s=new Subtraction();
		s.operations("subtraction");
		s.calc(20, 10);
		

	}

}
