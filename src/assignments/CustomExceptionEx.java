package assignments;
import java.util.Scanner;//To take user input here
class SumGreaterThan100Exception  extends Exception
{
	String msg;
	SumGreaterThan100Exception(String msg)
	{
		this.msg=msg;
	}
}
interface IDemo
{
	int sum(int x,int y) throws SumGreaterThan100Exception ;
}

class DemoClass implements IDemo
{
	public int sum(int x,int y) throws SumGreaterThan100Exception
	{
		int sumofIntegers=x+y;

		if(sumofIntegers<=100)
		{
			return sumofIntegers;
		}
		else
		{
			throw new SumGreaterThan100Exception ("Sum is greater than 100");
		}
	}
}
public class CustomExceptionEx {
	public static void main(String args[])
	{
		System.out.println("***Assignment on  Exception***\n");
		System.out.println("***Creating custom exception***\n");
		//For Java old versions-use  BufferedReader e.g.
		//BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		//String c = br.readLine();
		Scanner in= new Scanner(System.in);//To take input from user
		int number1,number2;
		System.out.println("Enter first integer");
		number1=Integer.parseInt(in.nextLine());
		System.out.println("Enter second integer");
		number2=Integer.parseInt(in.nextLine());
		DemoClass demo=new DemoClass();
		try
		{
			int result=demo.sum(number1, number2);
			System.out.println("Sum of the numbers is "+ result);
		}
		catch(SumGreaterThan100Exception  e)
		{
			System.out.println( "Caught the custom exception : "+e);
			e.printStackTrace();
		}
	}
}
