import java.util.*;

//Sets up a vehicle which has a speed and direction
public class Vehicle implements MovingObjects
{
	//randomly allocate vehicles a constant speed
	Random rand = new Random();	
	final int SPEED = rand.nextInt(10);
	final String SYMBOLEW = "D";
	final String SYMBOLNW = "M";
	private int direction; //1 = EW, and 2 = NS
	
	//a vehicle has a direction, a symbol and a speed
	public void Vehicle(int direction)
	{
		this.direction = direction;
		
	}
	
	//Not being used here because direction is defined as a vehicle
	//But there should be a way to give random directions
	public int direction()
	{
		return 0;
	}
	
	public String symbol()
	{
		//if direction is E-W
		if(direction == 1)
		{
		//Traverse through here or in drawer?-Probs draw
		//If they are traveling East West
		//For the number of columns increase
//			for(int i=0; i<columns; i++)
//			{
//			    column++;
//			}
			return SYMBOLEW;
		}
		else
		{
			String placeholder = "";
			 return placeholder;
		}
		//Traverse through here or in drawer?-Probs draw
			//else if dierction is North South:
//		 	for(int i=0; i<rows; i++)
//		 	{
//		 		row ++;
//		 	}
		
	}
	
	public int speed()
	{
		return SPEED;
	}
	
	//Delay before entering next spot
	public void waitForSeconds()
	{
		
	}
	
	//Destroy thing once it exits the grid
	public void destroy()
	{
		
	}
	
	//make the vehicle
	public void makeMovingObject()	
	{
		
	}
	
	//A Vehicle has a speed, and direction
	public void getVehicle()
	{
		
	}
}