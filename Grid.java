//Needs to pudate every 20 milliseconds and stop after 2,000 updates
public class Grid //implements Drawable
{
	private int row;
	private int column;
	private String[][] spaces;
	Vehicle car;

	//Sets up grid with a number of rows and columns and spaces
	public Grid(int row, int column)
	{
		this.row = row;
		this.column = column;
		
		spaces = new String [this.row][this.column];
	}
	
	public void updateGrid()
	{
		
		
	}
	
	public void addCar()
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