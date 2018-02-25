//Needs to pudate every 20 milliseconds and stop after 2,000 updates
public class Grid 
{
	private int row;
	private int column;
	
	public Grid(int row, int column)
	{
		this.row = row;
		this.column = column;
	}

	
	public void update()
	{
		
	}
	
	
	public void setRow(int r)
	{
		this.row = r;
	}
	
	public int getRow()
	{
		return row;
	}
	
	public void setColumn(int c)
	{
		this.column = c;
	}
	
	public int getColumn()
	{
		return column;
	}
}
