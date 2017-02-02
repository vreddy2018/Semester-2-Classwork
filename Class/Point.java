public class Point
{
	//class fields

	//nonstatic
	private int x; 
	private int y;
	private String name;
	
	//static field
	private static int numPoints = 0;
	
	
	
	
	//constructor - no void type; no return value; Constructs objects or reference types
	// name of constructor is name of class
	public Point()
	{
		/**
		x=0;
		y=0;
		name = "0";
		*/
		this(0,0,"O"); //calls Point(0,0, "0")
	}

	public Point (int x, int y)
	{
		this.x = x;
		this.y = y;
		name = "a";
		numPoints++;
	}
	
	public Point (int a, int b, String s)
	{
		x = a;
		y = b;
		name = s;
		numPoints++;
	}
	
	
	//member methods - modify, must return something or be void
	
	//accessors - with these, the above class fields can be made private 
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;	
	}
	
	public String getName()
	{
		return name;
	}
	
	public static int getNumPoints()
	{
		return numPoints;
	}
	
	
	//modifiers
	public void setX(int num)
	{
		x = num;
	}
	public void setY(int num)
	{
		y = num;
	}
	
	public String toString()
	{
		return name + "(" + x + ", " + y + ") ";
	
	}
	public static double slope(Point p1, Point p2)
	{
		double slope = (double) (p1.y - p2.y)/(p1.x-p2.x);
		return slope;
	}
	
	//p1.findSlope(p2)
	public double findSlope (Point p)
	{
		return (double) (p.y - this.y)/(p.x-x);
	}

	public static double distance (Point p1, Point p2)
	{
		double d = Math.pow((p1.x-p2.x),2) + Math.pow((p1.y-p2.y),2);
		d = Math.sqrt(d);
		return d;
	}
	
	public double distance (Point p)
	{
		return Math.sqrt(Math.pow((x-p.x),2) + Math.pow((y-p.y),2));
	}

}
