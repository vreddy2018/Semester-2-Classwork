
/**
 * Write a description of class Square1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square1 extends Rectangle1
{
    public Square1()
    {
        super(1,1);
    }
    public Square1(int s)
    {
        super(s,s);
    }
    
     public void setSideLength(int s)
    {
        super.setSideLength(s);
        super.setSideWidth(s);
    }
    public void setSideWidth(int s)
    {
        super.setSideLength(s);
        super.setSideWidth(s);
    }

}

