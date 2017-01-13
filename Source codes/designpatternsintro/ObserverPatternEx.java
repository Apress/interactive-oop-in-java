package designpatternsintro;
import java.util.*;

interface IObserver
{
	void update(int i);
}
class Observer1 implements IObserver
{
	@Override
	public void update(int i) 
	{
		System.out.println("Observer1 is seeing a change in Subject: "+i);	
	}
}
class Observer2 implements IObserver
{
	@Override
	public void update(int i) 
	{
		System.out.println("Observer2 get notification from Subject :"+i);			
	}
}
class Observer3 implements IObserver
{
	@Override
	public void update(int i) 
	{
		System.out.println("Observer3 is seeing the change in Subject :"+i);			
	}
}

interface ISubject
{
	void register(IObserver o);
	void unregister(IObserver o);
	void notifyObservers(int i);
}

class Subject implements ISubject
{
	private int myValue;


	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
		//Notify observers
		notifyObservers(myValue);
	}

	List<IObserver> observersList=new ArrayList<IObserver>();

	@Override
	public void register(IObserver o)
	{
		observersList.add(o);
	}
	@Override
	public void unregister(IObserver o)
	{
		observersList.remove(o);
	}
	@Override
	public void notifyObservers(int updatedValue) 
	{ 
		for(int i=0;i<observersList.size();i++)
		{
			observersList.get(i).update(updatedValue);
		}
	}		       
}


class ObserverPatternEx
{
	public static void main(String[] args)
	{
		System.out.println("*** Observer Pattern Example***\n");
		Subject sub = new Subject();
		Observer1 ob1 = new Observer1();
		Observer2 ob2 = new Observer2();
		Observer3 ob3 = new Observer3();
		//Only Observer1 and Observer2 is registered
		sub.register(ob1);
		sub.register(ob2);

		sub.setMyValue(10);
		System.out.println();
		sub.setMyValue(100);
		System.out.println();

		//unregister Observer1 only
		sub.unregister(ob1);
		//Now only Observer2 will observe the change
		sub.setMyValue(200); 
		System.out.println();
		//Take a new follower and register Observer3 now
		sub.register(ob3);
		//Set a new change in subject
		//Now observer 2 and observer 3 will see the change
		sub.setMyValue(500);        
	}
}

