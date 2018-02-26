
public class ObjectGenerator implements Runnable 
{
	Thread generator;
	Vehicle car;
	
	public void begin()
	{
		if(generator == null)
		{
			generator = new Thread(this);
			generator.start();
		}
	}
	
	public void end()
	{
	
	}
	
	public void getCar()
	{
		car = new Vehicle();
	}
	public void run()
	{
		
	}
}
