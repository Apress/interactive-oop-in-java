package useofstatickeyword.examples;

class StaticDemo6
{
	static void showMe()
	{
		System.out.println("Static method");
	}	
}

public class StaticEx6
{
	public static void main(String[] args)
	{
		System.out.println("***Static methods can be invoked through objects also in Java***");
	               //Using classname to call the static method
		StaticDemo6.showMe();
		//Using object to invoke the static method
		StaticDemo6 myOb=new StaticDemo6();
		myOb.showMe();
	}
}
