public class Triangle
{
	private Segment s1;
	private Segment s2;
	private Segment s3;
	
	
	// constructors (default, overloaded)
	public Triangle()
	{
		Point p1 = new Point();
		Point p2 = new Point(6,0);
		Point p3 = new Point (0,8);
		
		s1 = new Segment(p1,p2);
		s2 = new Segment (p1,p3);
		s3 = new Segment (p2,p3);
	}
	
	
	public Triangle(Segment a, Segment b, Segment c)
	{
		s1 = a;
		s2 = b;
		s3 = c;
		
	}
	
	
	// accessors
	public Segment getS1()
	{
		return s1;
	}
	public Segment getS2()
	{
		return s2;
	}
	public Segment getS3()
	{
		return s3;
	}	
	
	
	
	// modifiers
	public void setS1(Segment s)
	{
		s1=s;
	}
	public void setS2(Segment s)
	{
		s2=s;
	}
	public void setS3(Segment s)
	{
		s3=s;
	}
	
	
	// toString
	
	public String toString()
	{
		return s1.toString()+ "\n" + s2.toString() + "\n" + s3.toString();
	
	}
	
	
	public String getName()
	{
		return s1.getP1().getName() + s2.getP1().getName() + s3.getP1().getName();
	}
	
	
	public double perimeter()
	{
		return s1.getLength() + s2.getLength() + s3.getLength();
	
	}
	
	
	public double area()
	{
		double s = perimeter()/2;
		double a = s*(s-s1.getLength())*(s-s2.getLength())*(s-s3.getLength());
		a = Math.sqrt(a);
		return a;
	}
	
	
	

}