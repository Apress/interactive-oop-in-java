package interfaces.examples;
interface MyDefaultInterface
{
	void show();
	default void defaultMethod()
	{
		System.out.println("It is a default implementation in the interface");
	}
}
class MyClass6 implements  MyDefaultInterface
{
	@Override
	public void show() 
	{
		System.out.println("MyClass is implementing the Interface method.");		
	}
}

public class UseOfDefaultEx 
{
	public static void main(String args[])
	{
	System.out.println("***Interface Example.Demo-6***");
		System.out.println("***Use of default***");
		MyDefaultInterface interfaceOb=new MyClass6();
		interfaceOb.show();
		interfaceOb.defaultMethod();
	}
}

