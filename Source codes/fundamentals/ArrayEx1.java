package fundamentals;
public class ArrayEx1 
{
	public static void main(String args[])
	{
		System.out.println("***Fundamentals Review Examples -Arrays***"); 
		int[] myIntArray=new int[5];
		for(int i=0;i<5;i++)
		{
			myIntArray[i]=i*10;
		}
		System.out.println("Contents of Array:");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t"+myIntArray[i]);
		}
	}
}
