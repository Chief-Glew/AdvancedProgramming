import java.util.*;

//Sets up a vehicle which has a speed and direction
public class Vehicle implements MovingObjects
{
	//randomly allocate vehicles a constant speed
	Random rand = new Random();
	
	//Have a fixed Delay before entering spot
	//final int DELAY = 4; //have a fixed delay once entering a position before moving to next position--but just the same as using a fixed speed?
	final int SPEED = rand.nextInt(10);
	
	final String SYMBOLEW = "D";
	final String SYMBOLNW = "M";
	
	public void Vehicle()
	{
		
		
	}
	
	public String direction()
	{
		//if direction is E-W
		//if(direction = 1)
		//{
		//If they are traveling East West
		//For the number of columns increase
			//for(int i=0; i<columns; i++)
			//{
			//    column++;
			//}
		//	return SYMBOLEW;
		//}
		
		//else
		//{
		/*else if dierction is North South:
		 	* for(int i=0; i<rows; i++)
		 	* {
		 	* 	row ++;
		 	* }
		 */
		//  return SYMBOLNW;
		//}
		 String placeholder = "";
		 return placeholder;
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