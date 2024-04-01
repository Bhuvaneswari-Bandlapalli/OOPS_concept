package com.bhuvanaone;

public class One {
	public void login(String user,String pasw) {
		System.out.println("user and passward");
	}
	public void login(String user,int otp) {
		System.out.println("user and otp");
	}
	public static void main(String[] args) {
		One c=new One();
		c.login("bhuvana", 890);
		c.login("bhuvana", "rukmini");
		

	}

}
