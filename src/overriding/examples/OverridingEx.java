package overriding.examples;

class ParentClass
{
	public void showMe()
	{
		System.out.println("I am in Parent class");
	}
}
class ChildClass extends ParentClass
{
	public void showMe()
	{
		System.out.println("I am in Child class");
	}
}
class OverridingEx 
{
	public static void main(String args[]) 
	{
		System.out.println("***Method Overriding Demo***");
		ChildClass childOb=new ChildClass();
		childOb.showMe();
	}
}
