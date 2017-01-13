package overriding.examples;
class MyParentClass1
{
	final public void aFinalMethod()
	{
		System.out.println("In Parent class-a Final method");
	}	
	public void aNonFinalMethod()
	{
		System.out.println("In Parent class-Non final method");
	}	
}
class MyChildClass1 extends MyParentClass1
{
	//Cannot override now
	/*public void  aFinalMethod()
	{
		System.out.println("I am in Child class-aFinalMethod");
	}*/
	//It is ok
	 public void aNonFinalMethod()
	{
		System.out.println("I am in Child  class-a Non Final Method");
	}	
	
}
class PreventOverridingEx 
{
	public static void main(String args[]) 
	{
		System.out.println("***Prevent Method Overriding by use of final - Demo***");
		MyChildClass1 childOb=new MyChildClass1();
		childOb.aNonFinalMethod();
		childOb.aFinalMethod();
	}
}
