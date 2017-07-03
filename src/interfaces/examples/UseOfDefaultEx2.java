package interfaces.examples;

interface MyDefaultInterface2
{
	void show();
	default void defaultMethod()
	{
		System.out.println("It is a default implementation in the interface");
	}
}
class MyClass7 implements  MyDefaultInterface2
{
	@Override
	public void show() 
	{
		System.out.println("MyClass is implementing the Interface method.");		
	}
	@Override
	public void defaultMethod()
	{
		System.out.println("MyClass is overriding the default Interface method.");		
	}
}

public class UseOfDefaultEx2 
{
	public static void main(String args[])
	{
		System.out.println("***Interface Example.Demo-7***");
		System.out.println("***Use of default.Ex-2***");
		MyDefaultInterface2 interfaceOb=new MyClass7();
		interfaceOb.show();
		interfaceOb.defaultMethod();
	}
}
