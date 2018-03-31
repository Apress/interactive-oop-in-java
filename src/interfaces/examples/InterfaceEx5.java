package interfaces.examples;

interface Interface1
{
	void showInterface1Method();
}
interface Interface2
{
	void showInterface2Method();
}
//Interface extending another interfaces
interface Interface3 extends Interface1,Interface2
{
	void showInterface3Method();
}
class MyClass5 implements Interface3
{
	//Now MyClass5 needs to implement methods from Interface1,Interface2 and Interface3
	@Override
	public void showInterface1Method() {
		System.out.println("MyClass5 is implementing the showInterface1() method ");	
		
	}
	@Override
	public void showInterface2Method() {
		System.out.println("MyClass5 is implementing the showInterface2() method ");		
	}
	@Override
	public void showInterface3Method() {
		System.out.println("MyClass5 is implementing the showInterface3() method ");		
		
	}	
}
public class InterfaceEx5 {
	public static void main(String args[])
	{
		System.out.println("***Interface Example.Demo-5***");
		System.out.println("***Interface  can extend interfaces***");		
		MyClass5 myClassOb=new MyClass5();
		myClassOb.showInterface1Method();		
		myClassOb.showInterface2Method();
		myClassOb.showInterface3Method();		
	}
}
