import java.awt.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* The grid drawer just draws the grid.
 * On its start it fires up the ObjectGenerator
 */
public class GridDraw implements Runnable
{
	
	Grid grid;
	ObjectGenerator generator;
	private final int TOTALTIME;
	private final int UPDATE;
	private int count;
	
	public GridDraw(int TOTALTIME, int UPDATE, ObjectGenerator generator, Grid grid)
	{
		this.TOTALTIME = TOTALTIME;
		this.UPDATE = UPDATE;
		this.generator = generator;
		this.grid = grid;
	}
	
	//Set Object Generator on Grid to shoot out cars
	public void setOnGrid(int col, int row)
	{
	
	}
	
	//run the grid for 2000 times at 20ms
	public void run()
	{
		//While we haven't drawn the 2000 times
		while(count<TOTALTIME)
		{
			//while running need to get the car symbols which draws the grid
			try
			{
				//while it is inside the grid, draw the symbols
				for(int i= 0; i<grid.getSpaces().length; i++)
				{
				}
			}
			
			Thread.sleep(UPDATE);
			count++;
			//Print out 'grid'/symbnols
			System.out.println("");
			catch (InterruptedException ahh) 
			{
				ahh.printStackTrace();
			}	
		}
		
	}
	
}