package fundamentals;

public class ArrayEx2 
{
	public static void main(String args[])
	{
		System.out.println("***Fundamentals Review Examples -Arrays***"); 
		int[] myIntArray=new int[3];		
		myIntArray[0]=10;
		myIntArray[2]=20;
		System.out.println("Contents of Array:");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t"+myIntArray[i]);
		}
	}
}
