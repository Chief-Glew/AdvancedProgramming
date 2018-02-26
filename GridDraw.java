import java.awt.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//Implemented drawblae?
public class GridDraw implements Runnable {
	
	//Give a grid number of Rows and Columns
	Grid grid = new Grid(7, 8);
	ObjectGenerator generator;
	
	private ReentrantLock gridSpaceLock = new ReentrantLock();
	private Condition gridSpaceCondition = gridSpaceLock.newCondition();
	private boolean openSpace = false;
	
	public void GridDraw()
	{
		
	}
	
	public void start(Vehicle car)
	{
		car.speed();
		
		gridSpaceLock.lock();
		try
		{
			//if space is open then wait
			while (!openSpace)
			{
				gridSpaceCondition.await();
			}
			//want to move car up a spot
		}
		catch(InterruptedException interrupt)
		{
			interrupt.printStackTrace();
		}
		finally 
		{
			gridSpaceLock.unlock();
		}
	}
	
	//Set Object Generator on Grid to shoot out cars
	public void setOnGrid(int col, int row)
	{
	
	}
	

	public void run()
	{
		
	}
	
//	public void draw(Graphics graphic)
//	{
//		
//	}
}