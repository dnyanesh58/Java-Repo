package com.app.fruits;

public abstract class Fruit 
{
	private String colour;
	private double weight;
	private String name;
	private boolean fresh;
		
	public Fruit(String colour,double weight,String name)
	{
		this.colour = colour;
		this.weight = weight;
		this.name = name;
		this.fresh = true;
	}
	
	public String taste()
	{
		return "no specific taste";
	}
	
	public String toString()
	{
		String str = "Name : "+name+"\nColour : "+colour+"\nWeight : "+weight+"\nTaste : "+taste();
		return str;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setFresh(boolean fresh)
	{
		this.fresh = fresh;
	}
	
	public boolean getFresh()
	{
		return fresh;
	}
	
	/*public boolean equals()
	{
		return taste() == "Sour" ;
	}*/
}
