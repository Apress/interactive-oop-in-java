package interfaces.examples;
interface MyInterface
{
	void show();
}
class MyClass implements MyInterface
{
	@Override
	public void show() 
	{
		System.out.println("MyClass is implementing the Interface method.");		
	}
}

public class InterfaceEx1 
{
	public static void main(String args[])
	{
		System.out.println("***Interface Example.Demo-1***");
		MyClass myClassOb=new MyClass();
		myClassOb.show();
	}
}
