package classes.examples;

class ClassA3
{
	int i;
	ClassA3(int i)
	{
	  this.i=i;
	}	
}
class ClassEx3
{
	public static void main(String args[])
	{
		System.out.println("*** A Simple class with 2 objects-obA And obB ***");
		System.out.println("*** obA.i And obB.i are different here ***");
		ClassA3 obA=new ClassA3(20);
		ClassA3 obB=new ClassA3(30);
		System.out.println("obA.i ="+ obA.i);
		System.out.println("obB.i ="+ obB.i);		
	}
}


