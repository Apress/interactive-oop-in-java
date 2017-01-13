package overriding.examples;
class ParentClassDemo
{
	public void showMe()
	{
		System.out.println("I am in Parent class");
	}	
}
class ChildClassDemo extends ParentClassDemo
{
	public void showMe()
	{
		System.out.println("I am in Child class");
	}
	//Error-method type is not compatible
	/*public int showMe()
	{
		System.out.println("I am in Child class");
		return 5;
	}*/
	//Ok-treating as method overloading
	public int showMe(int i)
	{
		System.out.println("I am also in Child class");
		return i;
	}
}
class OverridingEx2 
{
	public static void main(String args[]) 
	{
		System.out.println("***Method Overriding with method overloading Demo***");		
		ChildClassDemo childOb=new ChildClassDemo();
		childOb.showMe();
		System.out.println(childOb.showMe(5));//5
	}
}
