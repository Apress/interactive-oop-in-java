package inheritance.examples;

class Parent
{
	Parent()
	{
		System.out.println("Inside Parent Constructor");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Inside Child Constructor");
	}
}
class GrandChild extends Child
{
	GrandChild()
	{
		System.out.println("Inside GrandChild Constructor");
	}
}

public class TestConstructorCallingSequence 
{
	public static void main(String args[])
	{
		System.out.println("***Inheritance Example***");
		System.out.println("***Testing constructor calling sequence***");
		GrandChild grandChild=new GrandChild();
	}
}
