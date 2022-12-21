package com.my_first_package;

public class IfElseIfStatement 

{

	public static void main(String args[])
	{
		
			int marks=65;
	
			if(marks<50)
			{
				
				System.out.println(" Sorry!!! Your Result is : FAILED");
			}
			else if(marks>=50 && marks<60)
			{
				
				System.out.println(" Congatulations!!! You are PASSESD with : Grade D");
			}
			
			else if(marks>=60 && marks<70)
			{
				
				System.out.println(" Congatulations!!! You are PASSESD with : Grade C");
			}
			
			else if(marks>=70 && marks<80)
			{
				
				System.out.println(" Congatulations!!! You are PASSESD with : Grade B");
			}
			
			else if(marks>=80 && marks<790)
			{
				
				System.out.println(" Congatulations!!! You are PASSESD with : Grade A");
			}
			
			else if(marks>=90 && marks<100)
			{
				
				System.out.println(" Congatulations!!! You are PASSESD with : Grade A+");
			}
			
			else
			{
				System.out.println(" Hey!!! Invalid Marks");
			}
	
	
	
		
	}
}
