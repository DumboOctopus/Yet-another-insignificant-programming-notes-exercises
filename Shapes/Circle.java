public class Circle extends Shape
{
	protected double radius;


	public Circle ()
	{
		//should we put defaults? etc questions off that
		super("black", false); 
		this.radius = 0;
	}
	public Circle(double radius)
	{
		super("black", false);
		this.radius = radius;
	}
	public Circle (double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
	}

	//radius g/set
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	//should we put the at override?
	public double getArea ()
	{
		return 3.14159268*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*3.14159268*radius;
	}

	@Override
	public String toString()
	{
		String asString = "Circle with";
		asString += " radius: " + this.radius;
		asString += " color: " + this.color;
		asString += " filled: " + this.filled;
		return asString;
	}
}