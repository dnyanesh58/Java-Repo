package com.app.fruits;

public class Mango extends Fruit
{
	
	public Mango(String colour,double weight,String name)
	{
		super(colour,weight,name);
	}
	
	public String taste()
	{
		return "Sweet";
	}
	
	public void pulp()
	{
		System.out.println("Fruit is "+getName()+" & its Colour is "+getColour()+" is a pulpy");
	}
}
