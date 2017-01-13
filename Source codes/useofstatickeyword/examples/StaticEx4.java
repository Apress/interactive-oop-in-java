package useofstatickeyword.examples;

class StaticDemo4
{
	static void showMe()
	{
		System.out.println("In ShowMe()");
	}
	static void showMe(String s)
	{
		System.out.println("Hi ," +s);
	}
	static void showMe(int i)
	{
		System.out.println("You have supplied " +i);
	}
}
class StaticEx4
{
	public static void main(String[] args)
	{
		System.out.println("***Static methods can be overloaded***");
		StaticDemo4.showMe();
		StaticDemo4.showMe("John");
		StaticDemo4.showMe(25);
	}
}

