package com.app.fruits;

public class Orange extends Fruit
{
	public Orange(String colour,double weight,String name)
	{
		super(colour, weight, name);
	}
	
	public String taste()
	{
		return "Sour";
	}
	
	public void juice()
	{
		System.out.println("Fruit is "+getName()+" & its Weight is "+getWeight()+" its juicy"); 
	}
	
}
