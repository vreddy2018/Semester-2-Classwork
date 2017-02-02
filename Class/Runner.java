public class Runner
{
	public static void main(String[] args)
	{
		Point p1 = new Point();
		Point p2 = new Point(3,4,"hello");
		//System.out.println(p2.x); used when the integers were public
		//p2.setX(0);
		System.out.println(p2.getX());
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p2);
		System.out.println(Point.slope(p2,p1));
		System.out.println(p2.findSlope(p1));
		
		System.out.println(Point.getNumPoints());
		
		Segment sg = new Segment();
		System.out.println(sg);
		System.out.println(sg.getName());
		System.out.println(sg.getLength());
		System.out.println(sg.slope());
		
		Triangle t = new Triangle();
		System.out.println(t.perimeter());
		System.out.println(t.area());
		System.out.println(t.getName());
	}


}