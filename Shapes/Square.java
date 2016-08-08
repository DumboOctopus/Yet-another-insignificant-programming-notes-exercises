public class Square extends Rectangle
{
	//no attributes because all inheirted from Rectangle

	//constructors
	public Square (double side)
	{
		super(side, side);
	}
	public Square (double side, String color, boolean filled)
	{
		super(side, side, color, filled);
	}
	
	//length=width=side g/set
	public double getSide()
	{
		return this.length;
	}
	public void setSide(double side)
	{
		this.length = side;
		this.width = side;
	}

	//set width and length
	public void setWidth(double side)
	{
		this.width = side;
	}
	public void setLength(double side)
	{
		this.length = side;
	}

	@Override
	public String toString()
	{
		String asString = "Square with ";
		asString += "side length: " + this.length;
		asString += " and color " + this.color;
		asString += ". Filled? " + this.filled;
		return asString;
	}
}