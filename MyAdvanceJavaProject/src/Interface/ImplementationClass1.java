package Interface;

public class ImplementationClass1 implements InterfaceClass1
{

	public void m1()
	{
		
		System.out.println("Hey!!! This is Method 1");
	}
	
	public void m2()
	{
		
		System.out.println("Hey!!! This is Method 2");
	}
	
	public void m3()
	{
		
		System.out.println("Hey!!! This is Method 3");
	}
	
	public void m4()
	{
		
		System.out.println("Hey!!! This is Method 4");
	}
	
	public void m5()
	{
		
		System.out.println("Hey!!! This is Method 5");
	}
	
	
	public static void main(String args[])
	{
		
		ImplementationClass1 x=new ImplementationClass1();
		x.m1();
		x.m2();
		x.m3();
		x.m4();
		x.m5();
		
	}
	
}
