package abstractclasses.examples;

class MyClassEx4
{
	//Constructors cannot be final/abstract/static
	/*abstract MyClassEx4()
	{
		System.out.println("I am a no argument constructor");		
	}*/
}
class ExperimentWithConstructorEx4
{
	public static void main(String args[])
	{
		System.out.println("*** Experiment with constructors  ***");
		System.out.println("***Question:Can construcors be abstract?  ***");	
		MyClassEx4 myOb=new  MyClassEx4();
	}
}
