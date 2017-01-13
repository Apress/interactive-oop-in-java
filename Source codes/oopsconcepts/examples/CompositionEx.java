package oopsconcepts.examples;

abstract class SuperClass
{
	public abstract  void showMe();
}
//Both ClassA and ClassB are overriding their parent method.
class ClassA extends SuperClass
{
	@Override
	public void showMe() 
	{
		System.out.println("I am in Class A");		
	}
}
class ClassB extends SuperClass
{
	@Override
	public void showMe()
	{
		System.out.println("I am in Class B");
	}
}
//The concept of composition to avoid the diamond problem
class ClassC
{
	ClassA clsA;
	ClassB clsB;	
	ClassC()
	{
	  this.clsA=new ClassA();
	  this.clsB=new ClassB();
	}
	void ShowMeA()
	{
		clsA.showMe();
	}
	void ShowMeB()
	{
		clsB.showMe();
	}
}
public class CompositionEx 
{
	public static void main(String args[])
	{
		System.out.println("*** Example of composition to avoid multiple inheritance in Java***");
		CompositionEx ob=new CompositionEx();
		ClassC clsC=new ClassC();
		clsC.ShowMeA();
		clsC.ShowMeB();
	}
}
