package com.slokamOne;

public class Test {

	public static void main(String[] args) {
		Login j=new Login();
		String role=j.role("siva", "kumar");
		
		if(role.equals("Student")) {
			Student d=new Student();
			d.role();
			
		}
		else if(role.equals("Trainee")) {
			Trainee t=new Trainee();
			t.role();
		}
		else if(role.equals("Admin")) {
			Admin a=new Admin();
			a.role();
		}

	}

}
