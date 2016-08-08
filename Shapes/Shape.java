public abstract class Shape{
	protected String color;
	protected boolean filled;

	public Shape ()
	{

	}
	public Shape (String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}

	//color get/set
	public String getColor()
	{
		return this.color;
	}
	public void setColor (String color)
	{
		this.color = color;
	}

	//filled g/set
	public boolean isFilled ()
	{
		return this.filled;
	}
	public void setFilled (boolean filled)
	{
		this.filled = filled;
	}

	//abstracts
	abstract public double getArea ();
	abstract public double getPerimeter();
	
	//this again
	@Override
	public String toString()
	{
		return "color = " + this.color + " and it is filled? " + filled + "! ";
	}
}