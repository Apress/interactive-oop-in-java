package classes.examples;

public class A
{
	int sum;
	int sumOfNumbers(int... values)
	{
		int length=values.length;
		for(int i = 0; i < length; i++)
		{
			sum = sum + values[i];
		}
		return sum;
	}
}
