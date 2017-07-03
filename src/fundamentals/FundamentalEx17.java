package fundamentals;

public class FundamentalEx17 {
	public static void main(String args[])
	{
		int x=24;
		int y=11;
		int z=100;
		//int result= ++x * y--;//275
		int result= ++x *--y %z;
		System.out.println(" result is : "+ result);
		System.out.println(" y now : "+ y);	
	}
}
