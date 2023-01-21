package com.app.org;

public abstract class Employee 
{
	private int empid;
	private static int idctr;
	private String fname;
	private String lname;
	private double basic;
	private int deptid;
	
	static
	{
		idctr = 100;
	}
	
	public Employee(String fname,String lname,double basic,int deptid)
	{
		this.fname = fname;
		this.lname = lname;
		this.basic = basic;
		this.deptid = deptid;
		this.empid = idctr++;
	}
	
	public Employee(String fname,String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}
	
	public String toString()
	{
		String str = "Name : "+fname+" "+lname+"\nEmpid : "+empid+"\nDeptid : "+deptid+"\nBasic Salary : "+basic ;
		return str;
	}
	
	public void setBasic(double basic)
	{
		this.basic = basic;
	}
	
	public double getbasic()
	{
		return basic;
	}
	
	public abstract double computeSal();
	
	public int getEmpId()
	{
		return empid;
	}

	public String getFname()
	{
		return this.fname;
	}
	
	public String getLname()
	{
		return this.lname;
	}
	
	public boolean equals(Object emp)
	{
		if (emp instanceof Employee)
			return this.fname.equals(((Employee) emp).fname) && this.lname.equals(((Employee) emp).lname);
		return false;
	}
}
