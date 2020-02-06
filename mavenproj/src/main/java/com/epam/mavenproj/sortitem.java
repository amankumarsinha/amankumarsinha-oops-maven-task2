package com.epam.mavenproj;
import java.util.*;
public class sortitem 
{
	 public void sortprice(String c,int c1,String g,int g1,String b,int b1)
	{
		TreeMap<Integer,String>price=new TreeMap<Integer,String>();
		price.put(c1, c);
		price.put(g1, g);
		price.put(b1,b);
		System.out.println("--sorting according to total cost\n"+price+"in ruppees");
	}
	 public void sortwt(String c,float c1,String g,float g1,String b,float b1)
		{
			Map<Float,String>wt=new TreeMap<Float,String>();
			wt.put(c1, c);
			wt.put(g1, g);
			wt.put(b1,b);
			System.out.println("--sorting according to total wieght\n"+wt+" in gm");
		}

}
