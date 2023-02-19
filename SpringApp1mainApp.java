package com.pro;

public class mainApp {
	private int eid;
	private String fname;
	private int esalary;
	public void show() {
		System.out.println("Employee ID "+eid);
		System.out.println("Employee Name "+fname);
		System.out.println("Employee Salary "+esalary);
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

}
