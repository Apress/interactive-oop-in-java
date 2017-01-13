package fundamentals;
class A1
{
	int i;
	A1(int i)
	{
		this.i=i;
	}
}
public class ArrayEx3Modified 
{
	public static void main(String args[])
	{
		System.out.println("***Fundamentals Review Examples -Arrays***"); 
		A1[] myArray=new A1[5];
		myArray[0]=new A1(10);
		myArray[2]=new A1(25);		
		System.out.println("Contents of Array:");
		for(int i=0;i<5;i++)
		{
			if(myArray[i]!=null)
			{
			 System.out.println("myArray["+ i+"] : "+myArray[i].i);
			}
		}
	}
}
