package overriding.examples;
class ParentOverloadedClass
{
	public void showMe()
	{
		System.out.println("I am in Parent class");
	}
	public void showMe(int x)
	{
		System.out.println("Overloaded method in Parent. x is " +x);
	}
}
class ChildOverridedClass extends ParentOverloadedClass
{
	public void showMe()
	{
		System.out.println("I am in Child class");
	}
}
class  OverloadingWithOverridingEx 
{
	public static void main(String args[]) 
	{
		System.out.println("***Method Overriding with overloading Demo***");
		ChildOverridedClass childOb=new ChildOverridedClass();
		childOb.showMe();
		childOb.showMe(25);
	}
}

