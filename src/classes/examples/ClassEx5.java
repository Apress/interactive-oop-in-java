package classes.examples;

class Demo5
{
	int sum(int x, int y)
	{
		return x+y;
	}
}
public class ClassEx5 
{
	public static void main(String args[])
	{
		System.out.println("*** A Simple class with a method returning an integer ***");		
		Demo5 ob=new Demo5();
		int result=ob.sum(10,20);
		System.out.println("Sum of 10 and 20 is : "+ result);	
	}
}
