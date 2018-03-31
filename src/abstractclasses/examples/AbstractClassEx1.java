package abstractclasses.examples;

abstract class MyAbstractClass
{
	public  abstract void showMe();
}
class MyConcreteClass extends MyAbstractClass
{
	@Override
	public void showMe() 
	{
		System.out.println("I am from concrete class:");
		System.out.println("I am supplying the method body for showMe()");

	}	
}
class AbstractClassEx1
{
	public static void main(String Args[])
	{
		System.out.println("***Abstract class Demo***");
		//Illegal:Cannot instantiate
		//MyAbstractClass abstractOb=new MyAbstractClass();
		MyConcreteClass concreteOb=new MyConcreteClass();
		concreteOb.showMe();
	}
}
