package fundamentals;

public class CommandLineEx1 {
	public static void main(String args[])
	{
		System.out.println("*** Testing Command line arguments ***");
		//java CommandlIneEx1 John Sam Bob
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
}
