package com.app.org;

public class Worker extends Employee 
{
	private int hrsworked;
	private double hrlyrate;
	private double netsal;
	
	public Worker(String fname,String lname,double basic,int deptid,int hrsworked,double hrlyrate)
	{
		super(fname,lname,basic,deptid);
		this.hrsworked = hrsworked;
		this.hrlyrate = hrlyrate;
	}
	
	public Worker(String fname,String lname)
	{
		super(fname,lname);
	}
	
	public double computeSal()
	{
		netsal = getbasic() + (hrsworked * hrlyrate);
		return netsal;
	}
	
	public String toString()
	{
		return super.toString()+"\nHours Worked : "+this.hrsworked+"\nHourly Rate : "+this.hrlyrate;
	}
}
