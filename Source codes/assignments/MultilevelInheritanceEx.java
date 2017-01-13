package assignments;

class Parent
{
	public Parent()
	{
		System.out.println("I am in Parent constructor");	
	}
	/*public void showMe()
	{
		System.out.println("I am a Parent");
	}	*/
}
class Child extends Parent
{
	public Child()
	{
		System.out.println("I am in Child constructor");	
	}
	/*public void showMe()
	{
		System.out.println("I am a Child");
	}	*/
}
class GrandChild extends Child
{
	public GrandChild()
	{
		System.out.println("I am in GrandChild constructor");	
	}
	/*public void showMe()
	{
		System.out.println("I am a GrandChild");
	}*/	
}

class MultilevelInheritanceEx
{
	public static void main(String args[])
	{
		System.out.println("***Multilevel Inheritance Demo***");
		//Parent p=new Parent();
		//p.showMe();
		Child c=new Child();
		//c.showMe();
		GrandChild g=new GrandChild();
		//g.showMe();
	}
}
