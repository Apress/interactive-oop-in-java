package inheritance.examples;

class ParentA {
	int i;
	ParentA() 
	{ 
		System.out.println("Parent no -argument constructor");
	}	
}
class ChildA extends ParentA
{
	int b;
	ChildA()
	{
		//both this() and super() cannot be used together
		//super();
		this(2);
		System.out.println("Child no -argument constructor");
	}
	ChildA(int b) 
	{
		this.b=b;
		System.out.println("Child constructor . b= " +b);
	}
}
public class TestingthisEx1
{
	public static void main(String[] args)
	{
		ChildA obCA=new ChildA();		
	}
}
