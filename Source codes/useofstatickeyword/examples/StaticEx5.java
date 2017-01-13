package useofstatickeyword.examples;

/* The overloading is to be allowed if the method signature is different. In the above case, inclusion of a static keyword before a method name is not considered as a different signature.*/
class StaticEx5 
{
	/*static void showMe()
	{
		System.out.println("Static method");
	}*/
	void showMe()
	{
		System.out.println("Non Static method");
	}
}

