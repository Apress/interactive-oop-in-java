package fundamentals;

public class FundamentalEx20 {
	public static void main(String args[])
	{
		System.out.println("***Fundamentals Review Example -20***"); 
		System.out.println("***break vs continue***");
		System.out.println("***Example : break***"); 
		for(int i=0;i<5;i++)
		{
			System.out.print("At entry i is :"+i);
			if( i==3)				
				  break;				
			System.out.print("\t At Exit i is :"+i);
			System.out.println();
		}
		System.out.println();
		System.out.print("***Example : continue***\n"); 		
		for(int i=0;i<5;i++)
		{			
			System.out.print("At entry i is :"+i);
			if( i==3)				
				 continue;		
			System.out.print("\t At Exit i is :"+i);
			System.out.println();
		}
	}
}
