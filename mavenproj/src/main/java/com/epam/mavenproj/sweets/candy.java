package com.epam.mavenproj.sweets;

public class candy extends sweets {
	
	candy(String name,int no,int cost,float weight)
	{
		super(name,no,cost,weight);
	}
	public String showdet()
	{
		return "-->"+super.showdet();
		
	}

}
