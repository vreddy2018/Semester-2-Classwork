public class Segment
{
	//class fields (encapsulation)
	private Point p1;
	private Point p2;

	public Segment()
	{
		this(new Point(), new Point(3,4));
		
	
	}

	public Segment(Point a, Point b)
	{
		p1 = a;
		this.p2 = b;
	
	}
	
	//accessors
	public Point getP1()
	{
		return p1;
	}
	public Point getP2()
	{
		return p2;	
	}
	
	//other methods
	public String getName()
	{
		return p1.getName() + p2.getName();
	}
	
	public double getLength()
	{
		return p1.distance(p2);
	}

	public double slope()
	{
		return p1.findSlope(p2);
	}
	
	
	
	//modifiers
	public void setP1(Point p)
	{
		p1=p;
	}
	public void setP2(Point p)
	{
		p2=p;
	}
	
	
	//toString method
	public String toString()
	{
		return p1.toString()+ " " + p2.toString();
	
	}
}

