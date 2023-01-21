package com.app.org;

public class Manager extends Employee
{
	private double bonus;
	private double netsal;
		
    public Manager(String fname,String lname,double basic,int deptid,double bonus)
    {
    	super(fname,lname,basic,deptid);
    	this.bonus = bonus;
    }
    
    public Manager(String fname,String lname)
    {
    	super(fname,lname);
    }
    
    public double computeSal()
    {
    	netsal = bonus + getbasic();
    	return netsal;
    }
    
    public String toString()
    {
    	return super.toString()+"\nBonus : "+this.bonus;
    }
    
    public double getBonus()
    {
    	return bonus;
    }
}
