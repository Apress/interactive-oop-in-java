package interfaces.examples;

//Both of the interface have the same method name "show()".
interface MyInterface4A
{
	void show();
}
interface MyInterface4B
{
	void show();
}
class MyClass4 implements MyInterface4A,MyInterface4B
{
	@Override
	public void show() 
	{
		System.out.println("MyClass4 is implementing the show() method ");		
	}
	
}
public class InterfaceEx4 {
	public static void main(String args[])
	{
		System.out.println("***Interface Example.Demo-4***");
		
		//All the 3 callings are legal.
		MyClass4 myClassOb=new MyClass4();
		myClassOb.show();
		
		MyInterface4A inter4A=myClassOb;
		inter4A.show();
		
		MyInterface4B inter4B=myClassOb;
		inter4B.show();	
		
	}
}
