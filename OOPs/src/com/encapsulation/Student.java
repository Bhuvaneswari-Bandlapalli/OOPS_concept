package com.encapsulation;

public class Student {
	private int sid;
	private String sname;
	private int sage;
	private String qualification;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void studentData() {
		System.out.println("Student id: "+sid);
		System.out.println("Student name: "+sname);
		System.out.println("Student age: "+sage);
		System.out.println("Student qualification: "+qualification);
		
	}

}
