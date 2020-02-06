package com.epam.mavenproj.sweets;

public class barfi extends sweets {
	barfi(String name,int no,int cost,float weight)
	{
		super(name,no,cost,weight);
	}
	public String showdet()
	{
		return "-->"+super.showdet();
		
	}

}



