import java.util.*;

public class VehicleMovement implements MovingThings
{
	//randomly allocate vehnicles a constant speed
	Random rand = new Random();
	
	final int DELAY = 4; //have a fixed delay once entering a position before moving to next position
	final int SPEED = rand.nextInt(10);
	
	public void getDirectionality()
	{
		
	}
	
	public int getSpeed()
	{
		return SPEED;
	}
	
	public void waitForSeconds()
	{
		
	}
	
	public void destroy()
	{
		
	}
}
