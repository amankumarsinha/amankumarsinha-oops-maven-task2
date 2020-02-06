package com.epam.mavenproj.sweets;
import java.util.*;
import com.epam.mavenproj.*;

public class newyeargift 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("new year  gift box :-");
		int c,g,b,ccost,bcost,gcost;
		float cwt,bwt,gwt;
		
		System.out.println("enter no of candies in box");
		c=sc.nextInt();
		System.out.println("enter cost of candies ");
		ccost=sc.nextInt();
		System.out.println("enter weight candies ");
		cwt=sc.nextFloat();
		System.out.println("enter no of gems in box");
		g=sc.nextInt();
		System.out.println("enter cost of gems ");
		gcost=sc.nextInt();
		System.out.println("enter weight of gems ");
		gwt=sc.nextFloat();
		System.out.println("enter no of barfis in box");
		b=sc.nextInt();
		System.out.println("enter cost of barfis");
		bcost=sc.nextInt();
		System.out.println("enter weight of barfis");
		bwt=sc.nextFloat();
		candy candies = new candy("Candy",c, ccost,cwt );
		
	    gems gem = new gems("gems", g, gcost, gwt);
	    
	    barfi barfis= new barfi("barfi", b,bcost,bwt );
	    
	        sweets[] box= {candies,gem,barfis};
	        for(sweets s : box)
	        {
	        	System.out.println(s.showdet());
	        }
	        System.out.println("\n \n");
	        
	        sortitem so=new sortitem();
	 
	        System.out.println("Sort sweets by \n1.price \n2. weight");
            int i=sc.nextInt();
	        switch(i)
	        {
	        case 1: int can=candies.getPrice();
	                int ge=gem.getPrice();
	                int bf=barfis.getPrice();
	        	   so.sortprice("candy",can , "gems", ge, "barfis", bf);
	        	break;
	        case 2: float cawt=candies.setweight();
	              float goo= gem.setweight();
	                float bfwt= barfis.setweight();
	        	    so.sortwt("candy",cawt , "gems", goo, "barfis", bfwt);
	        	break;
	        	
	        default: System.out.println("invaid input");
	        }
	        
	        sc.close();
     }
}