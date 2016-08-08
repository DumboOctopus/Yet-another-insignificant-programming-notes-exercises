public class Rectangle extends Shape
{
	protected double width;
	protected double length;

	//constructors
	public Rectangle ()
	{
		super("black", false);
		this.width = 100;
		this.length = 100;
	}
	public Rectangle(double width, double length)
	{
		super("black", false);
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean filled)
	{
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	//width g/set
	public double getWidth ()
	{
		return this.width;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	//length g/set
	public double getLength ()
	{
		return this.length;
	}
	public void setLength (double length)
	{
		this.length = length;
	}

	//other methods (use at override?): not necessary to work but helps you debug errors if u spell method name wrong
	//actually kind not at all helpful. If we mispelled getArea
	//there would be no definition for the abstract method so 
	//the compiler would be upset anyways
	public double getArea()
	{
		return this.length*this.width;
	}
	public double getPerimeter()
	{
		return 2*(this.length + this.width);
	}
	@Override
	public String toString()
	{
		String asString = "Rectange of ";
		asString += "length: " + this.length;
		asString += ", width: " + this.width;
		asString += ", color: " + this.color;
		asString += "and is filled? " + filled + "!";
		return asString;
	}
}