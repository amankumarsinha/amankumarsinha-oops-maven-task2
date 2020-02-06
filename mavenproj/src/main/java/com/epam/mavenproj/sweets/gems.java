package com.epam.mavenproj.sweets;

public class gems extends sweets {
	gems(String name,int no,int cost,float weight)
	{
		super(name,no,cost,weight);
	}
	public String showdet()
	{
		return "-->"+super.showdet();
		
	}

}



