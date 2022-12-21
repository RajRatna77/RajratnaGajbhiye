package com.encapsulation;

public class Encapsulation 
{

	// private variables declared
    // these can only be accessed by
    // public methods of class
    private String Name;
    private int RollNo;
    private int Age;
 
    // get method for age to access
    // private variable geekAge
	    public int getAge() 
	    { 
	    	return Age; 
	    }
 
    // get method for name to access
    // private variable geekName
	    public String getName() 
	    { 
	    	return Name; 
	    }
 
    // get method for roll to access
    // private variable geekRoll
	    public int getRoll() 
	    { 
	    	return RollNo; 
	    }
 
    // set method for age to access
    // private variable geekage
	    public void setAge(int newAge) 
	    { 
	    	Age = newAge; 
	    }
 
    // set method for name to access
    // private variable geekName
	    public void setName(String newName)
	    {
	        Name = newName;
	    }
	 
    // set method for roll to access
    // private variable geekRoll
	    public void setRoll(int newRoll) 
	    { 
	    	RollNo = newRoll; 
	    }
}
 

