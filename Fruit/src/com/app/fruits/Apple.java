package com.app.fruits;

public class Apple extends Fruit
{
	public Apple(String colour,double weight,String name)
	{
		super(colour,weight,name);
	}
	
	public String taste()
	{
		return "Sweet n sour";
	}
	
	public void jam()
	{
		System.out.println("Fruit is "+getName()+" & its a jammy"); 
	}	
}
