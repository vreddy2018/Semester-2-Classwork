
/**
 * Write a description of class Rectangle1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    private int sideLength;
    private int sideWidth; 
    
    public Rectangle()
    {
        this(1,2);
    }
    
    public Rectangle (int l, int w)
    {
        sideLength = l;
        sideWidth = w;
    }
    
    public int getSideWidth()
    {
        return sideWidth;
    }
    public int getSideLength()
    {
        return sideLength;
    
    }
    public void setSideLength(int l)
    {
        sideLength = l;
    }
    public void setSideWidth(int w)
    {
        sideWidth = w;
    }
    
    public double area()
    {
        return sideLength*sideWidth;
    }
    
    public double perimeter()
    {
        return sideLength*2+sideWidth*2;
    }
    
    public String toString()
    {
        return "Length: " + sideLength + ", Width: " + sideWidth;
    }
    
    public boolean equals(Rectangle r)
    {
        return this.sideLength == r.getSideLength() && this.sideWidth == r.getSideWidth();
    }
    public void sayHell()
       {
        
           System.out.println("Hello");
        }
        public void sayHi()
        {
            System.out.println("hi");
        }
}
