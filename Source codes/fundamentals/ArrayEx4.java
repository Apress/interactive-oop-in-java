package fundamentals;

import java.util.Scanner;
public class ArrayEx4 {
	public static void main(String args[])
	{
		System.out.println("***Fundamentals Review Examples -Find a missing number using Arrays***"); 
		System.out.println("Type any 4 integers between 1 and 5( no repetition is allowed) :");
		int[] myStore=new int[5];
		int accumulatedSum=0;//To sum up the numbers you //have entered
		for(int i=0;i<4;i++)
		{
			Scanner in = new Scanner(System.in);
			int input= in.nextInt();
			myStore[i]=input;
		}
		System.out.println("You have entered:");
		for(int i=0;i<4;i++)
		{
			//if(myArray[i]!=null)
			{
				System.out.println("myStore["+ i+"] : "+myStore[i]);
				accumulatedSum=accumulatedSum+myStore[i];
			}
		}
		int expectedSum=5*(5+1)/2;//Sum of n integers=n*(n+1)/2;
		int missingNumber=expectedSum-accumulatedSum;
		System.out.println("The missing number is : "+missingNumber);
	}

}

