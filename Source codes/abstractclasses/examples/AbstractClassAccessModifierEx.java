package abstractclasses.examples;

abstract class MyAbstractClass1
{
	public abstract void showMe();	
}
class MyConcreteClass1 extends MyAbstractClass1
{
	@Override
	//Error: cannot reduce visibility
	//protected void showMe() 
	//make it public as in parent class
	public void showMe() 
	{
		System.out.println("I am from concrete class:");
		System.out.println("I am supplying the method body for showMe()");

	}
}

public class AbstractClassAccessModifierEx {
	public static void main(String args[])
	{
		MyAbstractClass myref=new MyConcreteClass();
		myref.showMe();
	}
}
