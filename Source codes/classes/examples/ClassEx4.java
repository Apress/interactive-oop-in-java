package classes.examples;

class ClassA4
{
	int i;
	ClassA4()
	{
		this.i=7;
	}
	ClassA4(int i)
	{
		this.i=i;
	}
	
}
class ClassEx4
{
	public static void main(String args[])
	{
		System.out.println("*** A Simple class with 2 objects-obA And obB ***");
		System.out.println("*** Different type of constructors are used here ***");
		ClassA4 obA=new ClassA4();
		ClassA4 obB=new ClassA4(25);
		System.out.println("obA.i ="+ obA.i);
		System.out.println("obB.i ="+ obB.i);	
	}
}

