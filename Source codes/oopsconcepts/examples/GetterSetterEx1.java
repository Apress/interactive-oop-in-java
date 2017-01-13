package oopsconcepts.examples;

class GetterSetter
{
	private int aVariable=5;
	public int getaVariable() {
		return aVariable;
	}
	public void setaVariable(int aVariable) {
		this.aVariable = aVariable;
	}

}
public class GetterSetterEx1
{
	public static void main(String args[])
	{
		System.out.println("*** Simple getter-setter example ***");		
		GetterSetter myOb=new  GetterSetter();
		//Following line will cause error:
		//We cannot access the private member
		//System.out.println(myOb.aVariable);
		System.out.println("aVariable is now : "+myOb.getaVariable());//5
		//Setting the variable
		myOb.setaVariable(25);
		//Check the modification
		System.out.println("aVariable is now : "+myOb.getaVariable());//25
	}
}
