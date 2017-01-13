package abstractclasses.examples;
abstract class AbstractClass
{
	public  abstract void showMe();
	public void completeMethod1() 
	{
		System.out.println(" Originally,I am from completeMethod1 in MyAbstractClass.But,I am complete.");	
	}
	public void completeMethod2() 
	{
		System.out.println(" Originally,I am from  completeMethod2 in MyAbstractClass.But,I am also complete.");	
	}
}
class ConcreteClass extends AbstractClass
{
	@Override
	public void showMe() 
	{
		System.out.println("I am from concrete class:");
		System.out.println("I am supplying the method body for showMe()");

	}
	//It wants to override completeMethod1() in MyAbstractClass
	public void completeMethod1() 
	{
		System.out.println("I am overriding completeMethod1 of MyAbstractClass.");	
	}
}
class AbstractClassEx2
{
	public static void main(String Args[])
	{
		System.out.println("***Abstract class Demo2***");
		ConcreteClass concreteOb=new ConcreteClass();
		concreteOb.showMe();
		//It will show that completeMethod1 is redefined in MyConcreteClass.
		concreteOb.completeMethod1();
		//It will show the details of completeMethod2 defined in MyAbstractClass.
		concreteOb.completeMethod2();
		//Following declaration will be fine
		AbstractClass abstractRef=new ConcreteClass();
		abstractRef.completeMethod1();
	}
}

