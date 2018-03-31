package overriding.examples;

class MyClassEx3
{
	//error
	//final MyClassEx3()
	MyClassEx3()
	{
		System.out.println("I am a no argument constructor");		
	}
}
class ExperimentWithConstructorEx3
{
	public static void main(String args[])
	{
		System.out.println("*** Experiment with constructors  ***");
		System.out.println("***Question: Can construcors be final?  ***");	
		MyClassEx3 myOb=new  MyClassEx3();
	}
}
