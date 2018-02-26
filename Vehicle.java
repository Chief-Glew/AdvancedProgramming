import java.util.*;

public class Vehicle implements MovingThings
{
	//randomly allocate vehicles a constant speed
	Random rand = new Random();
	
	//Have a fixed Delay before entering spot
	//final int DELAY = 4; //have a fixed delay once entering a position before moving to next position--but just the same as using a fixed speed?
	final int SPEED = rand.nextInt(10);
	
	public void Vehicle()
	{
		
		
	}
	
	public String isEastWest()
	{
		String eastWest = "|x|";
		return eastWest;
	}
	
	public String isNorthSouth()
	{
		String northSouth = "|o|";
		return northSouth;
	}
	
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
	
	public void makeMovingObject()	
	{
		
	}
	
	//A Vehicle has a speed, and direction
	public void getVehicle()
	{
		
	}
}
