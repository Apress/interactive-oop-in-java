package inheritance.examples;

class A3
{	
	int a;
	A3()
	{
		a=25;//some default value
	}
}
class B3 extends A3
{
	int a;//this will hide a in A3
	B3()
	{
		super.a=12;//for a in parent class
		a=50;//for a in B(child class)
	}
	void display()
	{
		System.out.println("a in parent class="+ super.a);
		System.out.println("a in child class="+ a);
	}
}

class TestingSuperEx2
{
	public static void main(String args[])
	{
		System.out.println("***The use of super Demo-2***");
		B3 obB3=new B3();
		obB3.display();
	}
}

