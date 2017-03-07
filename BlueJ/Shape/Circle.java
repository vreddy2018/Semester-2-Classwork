
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
   private static int radius;
   private static Point center;
   public static final double PI = 3.14159;
   public void sayHell()
       {
        
           System.out.println("Hello");
        }
   public Circle()
   {
       radius = 3;
       center = new Point(0,0);
    }
   public Circle (int r, Point p)
   {
    radius = r;
    center = p;
    }
   public int getRadius()
   {
       return radius;
    }
   public Point getCenter()
   {
       return center;
    }
    
   public void setRadius(int r)
   {
    radius = r;
    }
   public void setCenter (Point c)
   {
       center = c;
    }
   public void setCenter(int x, int y)
   {
       center = new Point(x,y);
    }
    
   public double perimeter()
    {
        return radius*PI*2;
    }
    public double area()
    {
        return radius*radius*PI;
    }
}
