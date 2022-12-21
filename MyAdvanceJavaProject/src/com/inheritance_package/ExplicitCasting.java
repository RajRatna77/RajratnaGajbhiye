package com.inheritance_package;

public class ExplicitCasting 

{

	public static void main(String args[])
	{
			
		double a=16;// 8 byte
		char aa =(char)a;
		System.out.println("VAlue After Char Explicit Casting"+aa);
		
		System.out.println();
		System.out.println();
		
		System.out.println("VAlue Before Explicit Casting"+a);
		int b=(int) a; //explicit casting((double->float->long->int)
		
		System.out.println("VAlue after Explicit Casting"+b);//16
		
		long lv = 10;

		int iv = (int) lv;

		System.out.println();
		System.out.println();
		
		System.out.println("Before conversion, int value ="+lv);  
		System.out.println("After conversion, long value ="+iv);//10

		System.out.println();
		System.out.println();
		
		long longVar = 922337203685477890L;

		
		System.out.println("Before conversion, int value ="+longVar);

		int intVar = (int) longVar;

		
		System.out.println("After conversion, int value ="+intVar);
		
		System.out.println();
		System.out.println();
		
		double d = 166.66;  
		//converting double data type into long data type  
		long l = (long)d;  
		//converting long data type into int data type  
		int i = (int)l;  
		System.out.println("Before conversion: "+d);  
		//fractional part lost  
		System.out.println("After conversion into long type: "+l);//166  
		//fractional part lost  
		System.out.println("After conversion into int type: "+i); 
		
		System.out.println();
		System.out.println();
		
		int x;

		float y = 1.5F;
		System.out.println("Before conversion, int value ="+y);

		x = (int) y; // Cast a float to an int

		
		System.out.println("After conversion, int value ="+x);//1
		
		byte k = 4;
		byte j = 5;
		byte m = (byte) (k + j);
		
		System.out.println(+m);
		
		
		float z=130.9f;
		byte c=(byte)z;
		System.out.println("Int After Conversion"+c);
	}
}
