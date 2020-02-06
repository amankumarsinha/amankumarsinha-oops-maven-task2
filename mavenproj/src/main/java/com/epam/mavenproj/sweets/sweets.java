package com.epam.mavenproj.sweets;

public abstract class sweets {
	String name;
	int no;
	int cost;
	float weight;
	public sweets(String name,int no,int cost,float weight) 
{
	this.name=name;
	this.weight=weight;
	this.cost=cost;
	this.no=no;
}
public float setweight()
{
	return weight*no;
}
public int getPrice() {

    return cost*no;

}


public String showdet() {
	
	

    return "" +name +" in gift box="+no+" piece"+ "--> Weight = " +weight+ "--> Price = " +cost+"-->total cost="+getPrice()+"-->total wieght="+setweight();

}


	

}
