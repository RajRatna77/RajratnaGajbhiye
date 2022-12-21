package com.abstraction;

public class Circle extends Shape
{

		double radius;
		 
	    public Circle(String color, double radius)
	    {
	 
	        // calling Shape constructor
	        super(color);
	        System.out.println("Circle constructor is Invoked");
	        this.radius = radius;
	    }
	 
	    @Override double area()//Completes the Incomplete method 'area()' from abstract class
	    {
	        return Math.PI * Math.pow(radius, 2);
	    }
	 
	    @Override public String toString() //Completes the Incomplete method 'toString()' from abstract class
	    {
	    {
	        return "Circle color is " + super.getColor()
	            + " and area is : " + area();
	    }
}
}

