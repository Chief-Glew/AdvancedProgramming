/* Instantiates cars at the edges of the grid either in
 * E to W direction or N to S direction
*/
public class ObjectGenerator implements Runnable 
{
	Thread generator;
	Vehicle car;
	
	//Get a car and start it on the edge of the grid
	public void begin()
	{
		if(generator == null)
		{
			//start a thread with a new car
			generator = new Thread(this);
			generator.start();
		}
	}
	
	public Vehicle getCar()
	{
		return car;
	}
	
	public void run()
	{
		
	}
	
	//Place the object Generator on a grid
	public void placeOnGrid(int xCoord, int yCoord)
	{
		
	}
}