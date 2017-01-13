package inheritance.examples;

class A2
{	
	int a;
	int b;
	A2(int a,int b)
	{
		System.out.println("I am in Parent constructor");
		this.a=a;
		this.b=b;		
	}	
	void parentMethod()
	{
		System.out.println("I am a Parent method");
	}
}
class B2 extends A2
{
	int c;
	B2(int a, int b,int c)
	{
		super(a,b);
		System.out.println("I am in Child constructor");
		this.c=c;	
	}
	void childMethod()
	{
		System.out.println("I am a Child method");
		System.out.println("I am calling the Parent method");
		super.parentMethod();
	}

}

class TestingSuperEx1 
{
	public static void main(String args[])
	{
		System.out.println("*** The use of super keyword Demo***");
		B2 obB2=new B2(1,2,3);
		System.out.println("a in ObB2="+ obB2.a);
		System.out.println("b in ObB2="+ obB2.b);
		System.out.println("c in ObB2="+ obB2.c);
		obB2.childMethod();
	}
}
