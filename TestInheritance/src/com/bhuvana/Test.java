package com.bhuvana;

public class Test {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.bike);
		System.out.println(c.house);
		System.out.println(c.loan);
		System.out.println(c.cash);
		System.out.println("================");
		
		Parent p=new Parent();
		
		System.out.println(p.bike);
		System.out.println(p.house);
		System.out.println(p.cash);
		 System.out.println("---------------");
		Parent g=new Child();
		System.out.println(g.bike);
		System.out.println(g.house);
		System.out.println(g.cash);
	}

}
