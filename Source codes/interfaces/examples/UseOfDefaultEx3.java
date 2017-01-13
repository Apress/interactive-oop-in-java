package interfaces.examples;

interface MyDefaultInterface3
{
	void show();
	default void myDefaultMethod()
	{
		System.out.println("Default implementation for interface3");
	}
}
interface MyDefaultInterface4
{
	void show();
	default void myDefaultMethod()
	{
		System.out.println("Default implementation for interface4");
	}
}
class MyClass8 implements  MyDefaultInterface3,MyDefaultInterface4
{
	@Override
	public void show() 
	{
	 System.out.println("MyClass is implementing the Interface method.");
	}
	
	@Override
	public void myDefaultMethod() 
            {
	  System.out.println("MyClass8 needs to implement this method");
	}
}

public class UseOfDefaultEx3 
{
	public static void main(String args[])
	{
		System.out.println("***Interface Example.Demo-8***");
		System.out.println("***Use of default.Ex-3***");
		MyDefaultInterface3 interfaceOb3=new MyClass8();
		interfaceOb3.show();
		interfaceOb3.myDefaultMethod();		
	}
}
