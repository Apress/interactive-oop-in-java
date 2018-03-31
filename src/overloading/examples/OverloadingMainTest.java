package overloading.examples;

public class OverloadingMainTest 
{
	public static void main(String args[])
	{
		System.out.println("***Method Overloading Demo***");
		System.out.println("From void main(String arg[])");
	}
	public static void main()
	{
		System.out.println("From void main()");
	}
	public static void main(String arg)
	{
		System.out.println("Hello " + arg);
	}
}

