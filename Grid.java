import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* A grid has rows, columns, and spaces
 * It has Object Generators attached to it that spew out objects
 * Needs to pudate every 20 milliseconds and stop after 2,000 updates
 */
public class Grid 
{
	private int row;
	private int column;
	private int[][] spaces;
	Vehicle car;
	private ReentrantLock gridSpaceLock = new ReentrantLock();
	private Condition gridSpaceCondition = gridSpaceLock.newCondition();
	private boolean openSpace = false;
	final String SPACESYMBOL = "|"; //better to just draw the side? Or the symbol be |x|? Because if empty, won't have draw
	
	//Better just to use spaces and NOT rows/columns? 
	//Then to have a direction can use something like start position in a random spot on 'grid'
	//and go to the next places of spaces[x][y] then to travel EW nextSpot = spaces[++currentPosition][inital] and N/S spaces[inital][++currentposition
	
	//Sets up grid with a number of rows and columns and spaces
	public Grid(int row, int column)
	{
		this.row = row;
		this.column = column;
		
		spaces = new int [this.row][this.column];
	}
	
	public void addMovingObject(Vehicle movingObj)
	{
		try
		{
			Thread.sleep(movingObj.speed());
		}
		catch(InterruptedException interrupted)
		{
			interrupted.printStackTrace();
		}
		
		//lock space once car is in
		gridSpaceLock.lock();
		
		try
		{
			//if there is already a car in the space then need to wait
			while(openSpace)
			{
				gridSpaceCondition.await();
			}
			openSpace = true;
			String symbol = SPACESYMBOL + movingObj.direction();
		}
		catch(InterruptedException interruptedSecondTry)
		{
			interruptedSecondTry.printStackTrace();
		}
		//After that, unlock the space so something else can enter
		finally
		{
			gridSpaceLock.unlock();
		}
	}
	
	public void updateGrid()
	{
		
		
	}

	
	public int getRow()
	{
		return row;
	}
	
	
	public int getColumn()
	{
		return column;
	}
	public int[][] getSpaces()
	{
		return spaces;
	}
}