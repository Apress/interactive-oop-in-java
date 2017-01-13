package classes.examples;
class ClassA
{
	int i=5;
}
class ClassEx1
{
	public static void main(String args[])
	{
		System.out.println("*** A Simple class with 2 objects-obA And obB ***");
		ClassA obA=new ClassA();
		ClassA obB=new ClassA();
		System.out.println("obA.i ="+ obA.i);
		System.out.println("obB.i ="+ obB.i);
		
	}
}
