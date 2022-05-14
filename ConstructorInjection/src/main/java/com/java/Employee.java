package com.java;

public class Employee {
	
	private int eid;
	private String Ename;
	private double Salary;
	
    public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.Ename = ename;
		this.Salary = salary;
	}


   public void display()
	{
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name: "+Ename);
		System.out.println("Employee Salary:"+Salary);
	}

}
