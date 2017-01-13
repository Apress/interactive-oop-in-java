package interfaces.examples;
interface MyInterface3A
{
	void show3A();
}
interface MyInterface3B
{
	void show3B();
}
class MyClass3 implements MyInterface3A,MyInterface3B
{
	@Override
	public void show3A() 
	{
		System.out.println("MyClass3 is implementing the show3A() method of Interface3A");		
	}
	@Override
	public void show3B() {
		System.out.println("MyClass3 is implementing the show3B() method of Interface3B");	
		
	}
}
public class InterfaceEx3 {
	public static void main(String args[])
	{
		System.out.println("***Interface Example.Demo-3***");
		MyClass3 myClassOb=new MyClass3();
		myClassOb.show3A();
		myClassOb.show3B();
	}
}

