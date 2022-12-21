package com.thiskeyword;

public class ThisKW 
{

	int length;
	  int breadth;
	 
	  // constructor to initialize values
	 public void Area(int length, int breadth) 
	 {
	    this.length = length;
	    this.breadth = breadth;
	  }
	 
	  // method to calculate area
	  public void getArea() 
	  {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
	  }
	  
	  
		  
		  public static void main(String args[])
		  {
			  
			  ThisKW k=new ThisKW();
			  k.Area(4, 6);
			  k.getArea();
			  
		  }
	  
}


