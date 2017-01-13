package inheritance.examples;
class SuperA {
	public SuperA(int x) 
	{ 
		System.out.print(x);
	}
}
class SuperB extends SuperA
{
	public SuperB(int a, int b) 
	{
		//int c = a + b;//Line-12
		//super(c); //error//Line-13
		//correct coding
		super(a+b); //Line-15
	}
}
public class TestingSuperEx3 {
	public static void main(String[] args)
	{
		SuperB sb=new SuperB(10,15);	
	}
}

