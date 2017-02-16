
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square
{
    private int sideLength;
    
    public Square()
    {
        sideLength = 1;
    }
    
    public Square(int s)
    {
        sideLength = s;
    }
    
    //overriding the method equals - you inherit from your superclass- which is object
    public boolean equals(Square s)
    {
        return this.sideLength == s.sideLength;
    }
    
    
    
     //overriding the method equals - you inherit from your superclass- which is object
     public String toString()
     {
        return "sidelength = " + sideLength;
    
    }
    
    public int getSideLength()
    {
        return sideLength;
    }
    
    public void setSideLength(int s)
    {
        sideLength = s;
    
    }
    
    public double area()
    {
        return sideLength*sideLength;
    }
}
