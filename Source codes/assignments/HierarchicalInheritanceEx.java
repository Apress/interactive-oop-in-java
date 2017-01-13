package assignments;

class Vehicle
{
	public void showVehicle()
	{
		System.out.println("I am in Vehicle");
	}	
}
class Car extends Vehicle
{
	public void showVehicle()
	{
		System.out.println("I am in Car");
	}	
}
class Motorcycle extends Vehicle
{
	public void showVehicle()
	{
		System.out.println("I am in Motorcycle");
	}	
}

class HierarchicalInheritanceEx 
{
	public static void main(String args[])
	{
		System.out.println("***Hierarchical Inheritance Demo***");		
		Car c=new Car();
		c.showVehicle();
		Motorcycle m=new Motorcycle();
		m.showVehicle();
	}
}

