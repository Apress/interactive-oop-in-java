package classes.examples;
class MyClass
{
	protected MyClass()
	{
		System.out.println("I am a no argument constructor");
		System.out.println("I Can have additional logic");
	}
}
public class ExperimentWithConstructorEx1 
{
	public static void main(String args[])
	{
		System.out.println("*** Experiment with constructors  ***");		
		MyClass myOb=new MyClass();
	}
}
