package com.inheritance_package;

public class ImplicitCasting 
{

	public static void main(String args[])
	{
		
			int a =10; // 4 byte.//automatic or widening casting
			System.out.println("Before conversion, int value ="+a); 
			double b=a; //8 byte.implicit casting(int->long->float->double)
			System.out.println("After conversion, int value ="+b); //10.0
			
			
			int x = 7;  
			//automatic
			//Manually converts the integer type into long type  
			long y = x;  
			//automatically converts the long type into float type  
			float z = y;  
			System.out.println("Before conversion, int value ="+x);//  7
			System.out.println("After conversion, long value ="+y);  //7
			System.out.println("After conversion, float value ="+z);  ////7.0
			
			System.out.println();
			System.out.println();
			
			float myFloat = 9.78f;//widening
			
		    double myDouble = myFloat; // Manual casting: double to int
		    System.out.println("Before conversion, float value ="+myFloat);  
			System.out.println("After conversion, double value ="+myDouble);

		    
			
			System.out.println();
			System.out.println();
			byte k = 5;
	        short s = k;
	        int i = s ;
	        long l = s;
	        float f = s;
	        double d = s; 
	        System.out.println("Examples of Widening Type casting...!!");
	        System.out.println("byte to short : "+s);
	        System.out.println("byte to int : "+i);
	        System.out.println("byte to long : "+l);
	        System.out.println("byte to float : "+f);
	        System.out.println("byte to double : "+d);
			
	}
	
}
