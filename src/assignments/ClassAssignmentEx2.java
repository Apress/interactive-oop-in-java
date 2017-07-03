package assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

class LeapYearDecider
{
	boolean isLeapYear(int yr)
	{
		if (yr%400 !=0)
		{
			if((yr%4==0) && (yr%100 !=0))
			{
				return true;
			}
			else
				return false;
		}
		return true;
	}
}

public class ClassAssignmentEx2 
{
	public static void main(String args[]) throws IOException
	{
		System.out.print("***Assignment on Class. Ex-2***\n\n ");
		System.out.print("***Test -whether a given year is a leap year or not***\n ");
		System.out.print("Enter an year\n\n ");		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		String str= br.readLine();
		int input=0;
		try
		{
		input=Integer.parseInt(str); 
		}
		catch(NumberFormatException e)
		{
			System.out.print(" Caught invalid Input : " +e);
			//A non zero status to indicate abnormal termination
			System.exit(-1);
		}
		/*Or we can use the scanner class to take input.Java 5 added this scanner class.
	      Scanner in=new Scanner(System.in);	    
	       int input=Integer.parseInt(in.nextLine());	     
		 */	 
		//LeapYearDeciderclass object
		LeapYearDecider ob=new LeapYearDecider();
		System.out.println( input +" is a leap year ? "+ob.isLeapYear(input));
	}
}

