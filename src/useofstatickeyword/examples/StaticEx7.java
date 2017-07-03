package useofstatickeyword.examples;

public class StaticEx7 
{
	int i;
	static void showMe()
	{
		//error
		//this.i=7;
		System.out.println("Static method");
	}	
}
