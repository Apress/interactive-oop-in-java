package overriding.examples;
class FinalDemo2
{
	//Must be initialized inside a constructor
	final double PI; 
	double area;
	FinalDemo2()
	{
	 PI=3.14;
	}
	FinalDemo2(int radius)
	{
		//Calling no-argument constructor to initialize the final variable
		this();
		this.area=this.PI*radius*radius;
	}
}
class Testingfinal 
{
	public static void main(String args[])
	{
		System.out.println("*** Testing the behavior of final ***");
		FinalDemo2 fd=new FinalDemo2(5);
		System.out.println("Area of a circle with radious 5 unit is ="+ fd.area+ " Sq. Unit");		
	}
}
