package assignments;
class MyVehicle
{
	int no_of_wheels;
	int no_of_seats;
	MyVehicle(int wheels,int seats)
	{
		no_of_wheels=wheels;
		no_of_seats=seats;
	}
	public void showVehicle()
	{
		System.out.print("Description:");
		System.out.println("\n*************");
		System.out.println("It has "+ no_of_wheels+" wheels");
		System.out.println("It has "+ no_of_seats+" seats\n");
	}	
}

class ClassAssignment_1_Demo 
{
	public static void main(String args[])
	{
		System.out.print("***Assignment on Class***\n\n ");
		MyVehicle car=new MyVehicle(4,4);
		MyVehicle motorCycle=new MyVehicle(2,2);
		System.out.print("Car ");
		car.showVehicle();
		System.out.print("Motorcycle ");
		motorCycle.showVehicle();
	}

}
