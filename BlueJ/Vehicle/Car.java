
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private String color;
    
    public Car()
    {
        super(4,150);
        color = "black";
    }
    public Car(int n,int m,String c)
    {
        super(n,m);
        color = c;
    }
    
    public String getColor()
    {
        return color;
    }
    public void setColor(String c)
    {
        color = c;
    }
}
