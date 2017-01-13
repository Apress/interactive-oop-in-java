package classes.examples;

class A6
{
	int i;	
	A6()
	{
		this.i=7;		
	}	
}
class ClassEx6 
{
	public static void main(String args[])
	{
		System.out.println("*** Simple class: quizes ***");	
		A6 ob1;
		ob1=new A6();
		System.out.println(ob1.getClass().getName());
		System.out.println(Integer.toHexString(System.identityHashCode(ob1)));
		System.out.println(ob1);
	}
}
