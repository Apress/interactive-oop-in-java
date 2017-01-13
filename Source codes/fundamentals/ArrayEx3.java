package fundamentals;
class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
}
public class ArrayEx3
{
	public static void main(String args[])
	{
		System.out.println("***Fundamentals Review Examples -Arrays***"); 
		A[] myArray=new A[5];
		myArray[0]=new A(10);
		myArray[2]=new A(25);		
		System.out.println("Contents of Array:");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t"+myArray[i]);
		}
	}
}
