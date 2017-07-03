package fundamentals;

public class FundamentalEx21 {
	public static void main(String args[])
	{
		System.out.println("***Fundamentals Review Example -21***"); 
		System.out.println("***String vs StringBuffer***");
		String str1="Hello";
		str1.concat("World");
		System.out.println(str1);//Hello
		System.out.println(str1.hashCode());
		System.out.println(str1.concat("World").hashCode());
		
		StringBuffer str2=new StringBuffer("Hello");
		str2.append("World");
		System.out.println(str2);//HelloWorld	
		System.out.println(str2.hashCode());
		System.out.println(str2.append("World").hashCode());
	}
}
