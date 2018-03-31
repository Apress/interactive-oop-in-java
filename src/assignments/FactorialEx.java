package assignments;

class Factorial
{
	int fact;
	//recursive version 
	int recursivelyCalculateFactorial(int i)
	{
		fact=1;
		if (i==1 || i==0)
			return 1;
		else
		{
			fact=i*recursivelyCalculateFactorial(i-1);
			return fact;
		}
	}
	//nonrecursive(iterative) version
	int iterativelyCalculateFactorial(int i) 
	{
		if (i==1 || i==0)

		{
			return 1;
		}
		else
		{
			fact=1;
			for(int j=1;j<=i; j++)
			{
				fact=fact*j;
			}
			return fact;
		}
	}
}


public class FactorialEx {
	public static void main(String args[])
	{
		System.out.println("*** Calculating factorial ***");
		Factorial factOb=new Factorial();
		System.out.println("*** By using recursive version ***");
		System.out.println("Factorial of 7 is :"+ factOb.recursivelyCalculateFactorial(7));
		System.out.println("*** By using nonrecursive(iterative) version ***");
		System.out.println("Factorial of 6 is :"+ factOb.iterativelyCalculateFactorial(6));
	}
}
