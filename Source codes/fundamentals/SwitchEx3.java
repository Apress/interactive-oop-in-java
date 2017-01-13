package fundamentals;
public class SwitchEx3 {
	public static void main(String args[])
	{
		System.out.println("***Discussions on Switch ***");
		char myChoice='e';
		switch (myChoice) 
		{
		case 'b': 
			System.out.println("b");
			break;
		default: System.out.println("Default"); 
			break;
		case 'a':
			System.out.println("a");
			break;         
		}		
	}
}
