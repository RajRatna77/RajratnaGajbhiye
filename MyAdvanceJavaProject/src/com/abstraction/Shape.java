package com.abstraction;

abstract public class Shape 
{

	String color;
	 
    // these are abstract methods
    abstract double area();
    public abstract String toString();
 
    // abstract class can have the constructor
    public Shape(String color)
	    {
	        System.out.println("Shape constructor is Invoked");
	        this.color = color;
	    }
 
    // this is a concrete method
    public String getColor() 
	    { 
	    	return color; 
	    }
	}

