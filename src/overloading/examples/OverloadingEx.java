package overloading.examples;


class Addition
{
	int sum(int x,int y)
	{
		return x+y;
	}
	double sum(double x,double y)
	{
		return x+y;
	}
	String sum(String s1,String s2)
	{
		return s1.concat(s2);
	}
}

public class OverloadingEx 
{
	public static void main(String args[])
	{
		System.out.println("***Method Overloading Demo***");
		Addition additionOb=new Addition();
		int sumOfIntergers=additionOb.sum(10,20);
		System.out.println("Sum of 10 and 20 is :"+sumOfIntergers);
		double sumOfDoubles=additionOb.sum(10.5,20.7);
		System.out.println("Sum of 10.5 and 20.7 is :"+sumOfDoubles);
		String sumOfStrings=additionOb.sum("Amit","Kumar");
		System.out.println("Concatenation of Amit and Kumar is :"+sumOfStrings);
	}
}
