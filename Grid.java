import java.util.concurrent.locks.*;

//Needs to pudate every 20 milliseconds and stop after 2,000 updates
public class Grid //implements Drawable
{
	private int row;
	private int column;
	private int[][] spaces;

	public Grid(int row, int column)
	{
		this.row = row;
		this.column = column;
	}
	
	public void updateGrid()
	{
		
		
	}
	
	public void addMovingObject()
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
}
