package classes.examples;

class A
{
	int sum;
	int sumOfNumbers(int...values)
	{
		int length=values.length;
		for(int i=0;i<=length;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class VarArgsEx {
	public static void main(String args[])
	{
		System.out.print("***Test on a method with variable arguments***\n\n ");
		System.out.println("1+2+3 = "+ new A().sumOfNumbers(1,2,3));
		System.out.println("1+2+3+4+5 ="+ new A().sumOfNumbers(1,2,3,4,5));
	}
}
