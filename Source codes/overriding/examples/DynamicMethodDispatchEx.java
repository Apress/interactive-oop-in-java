package overriding.examples;
class MyParentClass
{
	public void showMe()
	{
		System.out.println("I am in Parent class");
	}
}
class MyChildClass extends MyParentClass
{
	public void showMe()
	{
		System.out.println("I am in Child class");
	}
}
class DynamicMethodDispatchEx 
{
	public static void main(String args[]) 
	{
		System.out.println("***Dynamic Method Dispatch Demo***");
		MyParentClass parent=new MyParentClass();
		parent.showMe();
		MyChildClass childOb=new MyChildClass();
		/*Parent class reference to a child object*/
		parent=childOb;
		//childOb.showMe();
		parent.showMe();
	}
}
