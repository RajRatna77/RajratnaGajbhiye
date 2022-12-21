package com.encapsulation;

public class MainEncapsulation extends Encapsulation
{

	public static void main(String[] args)
    {
		Encapsulation obj = new Encapsulation();
 
        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
 
        // Displaying values of the variables
        System.out.println("Your name: " + obj.getName());
        System.out.println("Your age: " + obj.getAge());
        System.out.println("Your roll: " + obj.getRoll());
 
        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}
