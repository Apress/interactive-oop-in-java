package useofstatickeyword.examples;

class StaticDemo1
{
	//static members
	static int myStaticInt=5;
	static String myStaticString="I am a static string";
	//Non static members
	int myNonStaticInt=25;
}
public class StaticEx1 
{
	public static void main(String args[])
	{
		System.out.println("***Use of static variables***");
		//We can call static members with the class name itself
		//No need to create objects
		System.out.println("myStaticInt value is : "+StaticDemo1.myStaticInt);
		System.out.println("myStaticString value is : "+StaticDemo1.myStaticString);
		//Error:We cannot call instance variable with class name.
		//System.out.println("myNonStaticInt value is : "+StaticDemo1.myNonStaticInt);

	}
}
