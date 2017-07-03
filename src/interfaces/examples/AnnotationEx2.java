package interfaces.examples;
//Marker interface
interface IMarkerInterfaceDemo{}

//Marker Annotation
@interface IMarkerAnnotation{}

class Annotation2 implements IMarkerInterfaceDemo
{	
	public void myInterfaceMethod(){
		System.out.println("Implementing Marker Interface.");
	}
}
class Annotation3 
{	
	@IMarkerAnnotation public void myInterfaceMethod(){
		System.out.println("Implementing Marker Annotation.");
	}
}
public class AnnotationEx2 {
	public static void main(String args[]) 
	{
		System.out.println("***Simple use of  Marker Interface and Marker Annotation in Java***");
		Annotation2 anOb2=new Annotation2();
		Annotation3 anOb3=new Annotation3();
		anOb2.myInterfaceMethod();	
		anOb3.myInterfaceMethod();	
	}
}
