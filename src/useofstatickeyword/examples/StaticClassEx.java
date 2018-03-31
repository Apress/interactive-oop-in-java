package useofstatickeyword.examples;
//Java doesn't allow us to create top-level static classes, it must be  nested.
class OuterClass
{
	//static class
	static class MyStaticClass
	{
		public static void showStaticMethod()
		{
			System.out.println("I am a static method");
		}		
	}
	//non static inner class
	public class MyNonStaticClass
	{
		public void showNonStaticMethod()
		{
			System.out.println("I am a NonStatic method");
		}
	}
}

class StaticClassEx 
{
	public static void main(String args[])
	{
		System.out.println("***Static and Inner Class Demo***");
		//Call Static method		
		OuterClass.MyStaticClass.showStaticMethod();
		//CallNonStatic method
		OuterClass.MyNonStaticClass obNonStatic=(new OuterClass()).new MyNonStaticClass();
		obNonStatic.showNonStaticMethod();      
	}
}
