package com.my_first_package;

public class MyUDClass 
{
	
	
		public static void addition() // Static Method 
		
			{
				
				System.out.println("This is My Static Method");
				System.out.println("RAJRATNA");
				System.out.println('a');
				System.out.println("07071990");
				System.out.println(100);
				System.out.println("1+1");
				System.out.println('a'+'a');
				
			
			}
			
		public void subtraction() // Non.Static Method
		
			{
			
				System.out.println("This is My Non-Static Method");

			
			}
	
	public static void main(String args[]) //public static void main(String [] args )
	
		{
			
			addition();      //Calling static class
			MyUDClass.addition(); //Calling static class with class reference
			
			
			MyUDClass a = new MyUDClass(); //Creation an 'Object' with new keyword for Non-Static methods
			a.subtraction();	  //Calling Non-static class
		 
		}

}
