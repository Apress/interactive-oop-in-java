package abstractclasses.examples;
abstract class AbstractClass3
{
	public int myInt=5;
	public  abstract void showMe();
	public void completeMethod1() 
	{
		System.out.println("I am originally from completeMethod1 in MyAbstractClass.But,I am complete.");	
	}	
}
class ConcreteClass3 extends AbstractClass3
{
	@Override
	public void showMe() 
	{
		System.out.println("I am from concrete class:");
		System.out.println("I am supplying the method body for showMe()");

	}	
}

class AbstractClassEx3
{
	public static void main(String Args[])
	{
		System.out.println("***Abstract class Demo3***");
		AbstractClass3 abstractRef=new ConcreteClass3();
		abstractRef.completeMethod1();
		System.out.println("myInt in AbstractClass3="+abstractRef.myInt);		
	}
}
