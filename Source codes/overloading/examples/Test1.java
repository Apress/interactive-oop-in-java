package overloading.examples;

class A1
{
	A1()
	{
		System.out.println("Constructor with no argument");
	}
	A1(int a)
	{
		System.out.println("Constructor with one integer argument");
	}
	A1(int a,double b)
	{
		System.out.println("Constructor with one integer argument and one double argument");
	}
}
class Test1 
{
	public static void main(String args[])
	{
		System.out.println("***Constructor Overloading Demo***");
		A1 ob1=new A1();
		A1 ob2=new A1(2);
		A1 ob3=new A1(2,3.7);	
	}
}
