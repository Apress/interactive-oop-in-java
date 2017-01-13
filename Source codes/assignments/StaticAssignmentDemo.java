package assignments;

class NominateACaptain
{
	private static NominateACaptain _captain; 
	//We make the constructor private to prevent the use of "new" 	
	private NominateACaptain() { } 
	//To make the code thread safe using the synchronized version.
	// public static  NominateACaptain getCaptain()
	public static  synchronized NominateACaptain getCaptain()
	{ 	        
		// Lazy initialization 
		if (_captain == null) 
		{ _captain = new NominateACaptain(); 
		System.out.println("We have selected the captain for our team"); 
		} 
		else
		{ 
			System.out.print(" We already have a Captain.");
			System.out.println(" We'll send him for the toss.");
		} 
		return _captain; 
	}	
}
class StaticAssignmentDemo
{ 
	public static void main(String[] args)
	{ 
		System.out.println("***Static Assignment Demo***\n");		
		System.out.println("Trying to make a captain for our team");
		NominateACaptain c1 = NominateACaptain.getCaptain(); 
		System.out.println("Trying to make another captain for our team");
		NominateACaptain c2 = NominateACaptain.getCaptain();
		if (c1 == c2) 
		{ 
			System.out.println("c1 and c2 are same instance"); 
		} 
	} 
}
