import java.awt.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//Implemented drawblae?
public class GridDraw implements Runnable {
	
	//Give a grid number of Rows and Columns
	Grid grid = new Grid(7, 8);
	
	private ReentrantLock gridSpaceLock = new ReentrantLock();
	private Condition gridSpaceCondition = gridSpaceLock.newCondition();
	private boolean openSpace = false;
	
	public void run()
	{
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
	
//	public void draw(Graphics graphic)
//	{
//		
//	}
}
