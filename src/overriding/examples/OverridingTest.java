package overriding.examples;

//Is it an example of overriding?
class Class1
{
	final public void aFinalMethod()
	{
		System.out.println("I am in Class-1");
	}	
}
class Class2
{
	final public void aFinalMethod()
	{
		System.out.println("I am in Classs-2");
	}
}

public class OverridingTest
{
	public static void main(String args[]) 
	{
		System.out.println("***Is it an example of overriding?***");
		Class2 obClass2=new Class2();
		obClass2.aFinalMethod();
	}
}
