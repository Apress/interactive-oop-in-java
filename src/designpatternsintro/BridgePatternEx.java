package designpatternsintro;

//Colors-The Implementer

interface IColor
{
	void fillWithColor(int border);
}
class RedColor implements IColor
{       
	@Override
	public void fillWithColor(int border) 
	{
		System.out.print("Red color with " +border+" inch border");

	}
}
class GreenColor implements IColor
{
	@Override
	public void fillWithColor(int border) 
	{
		System.out.print("Green color with " +border+" inch border.");

	}       
}

//Shapes-The Abstraction

abstract class Shape
{
	//Composition
	protected IColor color;     
	protected Shape(IColor c)
	{
		this.color = c;
	}      
	abstract void drawShape(int border); 
	abstract void modifyBorder(int border,int increment);
}

class Triangle extends Shape
{ 
	protected Triangle(IColor c)
	{ 
		super(c);
	} 
	//Implementer specific method
	@Override
	void drawShape(int border) {
		System.out.print(" This Triangle is colored with: ");
		color.fillWithColor(border);			
	}
	//Abstraction specific method
	@Override
	void modifyBorder(int border,int increment) {
		System.out.println("\nNow we are changing the border length "+increment+ " times");
		border=border*increment;
		drawShape(border);			
	}		 
}

class Rectangle extends Shape
{
	public Rectangle(IColor c)   
	{
		super(c);
	}
	//Implementer specific method
	@Override
	void drawShape(int border) 
	{
		System.out.print(" This Rectangle is colored with: ");
		color.fillWithColor(border);
	}
	//Abstraction specific method
	@Override
	void modifyBorder(int border,int increment) {
		System.out.println("\n Now we are changing the border length "+increment+ " times");		
		border=border*increment;
		drawShape(border);			
	}
}

class BridgePatternEx 
{
  public static void main(String[] args)
  {    	
  	System.out.println("*****Bridge Pattern Demo*****");
		//Coloring Green to Triangle
		System.out.println("\nColoring Triangle:");
		IColor green = new GreenColor();
		Shape triangleShape = new Triangle(green);
		int initialBorder=10;
		triangleShape.drawShape(initialBorder);
		//Modifying the border length
		triangleShape.modifyBorder(initialBorder, 3);

		//Coloring Red to Rectangle
		System.out.println("\n\nColoring Rectangle :");
		IColor red = new RedColor();
		Shape rectangleShape = new Rectangle(red);
		//nitial border for Rectangle
		initialBorder=initialBorder*3;
		rectangleShape.drawShape(initialBorder);
		//Modifying the border length
		rectangleShape.modifyBorder(initialBorder,5);	
  }
}
