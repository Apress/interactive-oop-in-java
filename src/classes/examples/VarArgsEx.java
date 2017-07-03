package classes.examples;

public class VarArgsEx {
	public static void main(String args[])
	{

		A v1 = new A();

		System.out.print("***Test on a method with variable arguments***\n\n ");
		System.out.println("4 + 5 + 6 = " + v1.sumOfNumbers(4,5,6));
		System.out.println("1+2+3+4+5 = " + new A().sumOfNumbers(1,2,3,4,5));
	}
}
