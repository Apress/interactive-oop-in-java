package useofstatickeyword.examples;

class StaticDemo3
{
	static void aStaticmethod()
	{
		System.out.println("I am a static method");
	}
	void aNonStaticmethod()
	{
		System.out.println("A non static method");
	}
}
class ChildStaticDemo3 extends StaticDemo3
{
	static void aStaticmethod()
	{
		System.out.println("I am a overriding the static method");
	}
	void aNonStaticmethod()
	{
		System.out.println("Overriding a non static method");
	}
}
public class StaticEx3 
{
	public static void main(String args[])
	{
		System.out.println("***Testing the static methods***");
		StaticDemo3.aStaticmethod();
		ChildStaticDemo3.aStaticmethod();
		//Checking dynamic method dispatch
		StaticDemo3 parent=new ChildStaticDemo3();
		parent.aStaticmethod();
		parent.aNonStaticmethod();

	}
}
