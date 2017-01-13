
//Primary Version
/*package overriding.examples;

class ParentCov
{
	int i;
	int getMultipliedNumber(int x )
	{
		System.out.println("Inside Parent");
		this.i=x;
		return (int) (i*1.75); 
	}	
}
class ChildCov extends ParentCov
{
	int getMultipliedNumber(int x )
	//error:Return type is incompatible
	//double getMultipliedNumber(int x )
	{
		System.out.println("Inside Child");
		this.i=x;
		return  i*50; 
	}	

}

public class CovarianceEx {
	public static void main(String args[])
	{				
		System.out.println("***Datatype :primitive(int)***\n");
		ParentCov pOb=new ParentCov();
		int result1=pOb.getMultipliedNumber(10);
		System.out.println("Multiplied result="+result1);
		
		pOb=new ChildCov();
		result1=pOb.getMultipliedNumber(10);
		System.out.println("Multiplied result="+result1);		
	}
}*/
//Modified Version
package overriding.examples;

class ParentCov
{
	int i;
	int getMultipliedNumber(int x )
	{
		System.out.println("Inside Parent");
		this.i=x;
		return (int) (i*1.75); 
	}
	ParentCov getMultipliedNumber(int x,int y )
	{
		System.out.println("Inside Parent-overloaded version");
		this.i=x*y;
		return this;
	}
}
class ChildCov extends ParentCov
{
	int getMultipliedNumber(int x )
	//error:Return type is incompatible
	//double getMultipliedNumber(int x )
	{
		System.out.println("Inside Child");
		this.i=x;
		return  i*50; 
	}
	ChildCov getMultipliedNumber(int x,int y )
	{
		System.out.println("Inside Child- overloaded version");
		this.i=x*y*25;
		return this;
	}
}

public class CovarianceEx {
	public static void main(String args[])
	{
		System.out.println("*** Testing the covariance return type in Java ***");
		System.out.println("***Datatype :primitive(int)***\n");
		ParentCov pOb=new ParentCov();
		int result1=pOb.getMultipliedNumber(10);
		System.out.println("Multiplied result="+result1);
		
		pOb=new ChildCov();
		result1=pOb.getMultipliedNumber(10);
		System.out.println("Multiplied result="+result1);
		
		System.out.println("\n***Testing covariance now.Datatype: non-primitive***\n");
		
		ParentCov pOb2=new ParentCov();
		pOb2=pOb2.getMultipliedNumber(10,20);
		System.out.println("Multiplied result="+pOb2.i);
		
		ParentCov pOb3=new ChildCov();
		pOb3=pOb3.getMultipliedNumber(10,20);
		System.out.println("Multiplied result="+pOb3.i);			
	}
}

