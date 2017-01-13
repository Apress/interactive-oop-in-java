package classes.examples;
class ConsEx3
{
	int i;
	ConsEx3(int i)
	{
		this.i=i;
	}
	protected void finalize() 
	{
		System.out.println("Freeing all resources");
		System.out.println("ConsEx2 object is null already");		
	}
}
public class ExperimentWithConstructorEx3 {
	public static void main(String args[])
	{
		System.out.println("***Experimenting with GC***");
		ConsEx3 ob2=new ConsEx3(5);
		ob2=null;
		//System.runFinalization();
		System.gc();		
	}
}
