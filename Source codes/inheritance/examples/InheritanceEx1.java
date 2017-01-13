package inheritance.examples;

class ParentClass
{
 public void show()
  {
    System.out.println("I am in Parent Class");
  }
}
class ChildClass extends ParentClass
{
}

class InheritanceEx1
{
	public static void main(String args[])
	{
		ChildClass child1=new ChildClass();
     //Calling  show() through ChildClass object
		child1.show();
	}
}
