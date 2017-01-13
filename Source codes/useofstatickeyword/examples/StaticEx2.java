package useofstatickeyword.examples;
class StaticEx2
{
	//static members
	static int myStaticInt=1;
	static String myStaticString="No string";
             //instance variable
	int nonStaticInt=25;
	//static method
	static void setValuesToStaticMembers()
	{
		System.out.println("I am inside the static method now.");	
		System.out.println("myStaticInt="+ myStaticInt);	
		System.out.println("myStaticString="+ myStaticString);	
                          //error:Can access only static fields from here
		//System.out.println("myNonStaticInt="+ myNonStaticInt);	
	}	
	//static block
	static
	{
		System.out.println("I am a static block");	
		System.out.println("Before my change :");	
		System.out.println("myStaticInt="+ myStaticInt);	
		System.out.println("myStaticString="+ myStaticString);	
		System.out.println("I am changing the values now...");	
		myStaticInt=5;
		myStaticString="I am a static string";		
	}
	public static void main(String args[])
	{
		System.out.println("***Use of static methods and static blocks***");
		StaticEx2.setValuesToStaticMembers();
	}
}
