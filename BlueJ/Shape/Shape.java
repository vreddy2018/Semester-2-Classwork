
/**
 * Write a description of class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape implements Compare
{
   public abstract double perimeter();
   
    public abstract double area();
    public abstract void sayHell();
    public boolean comparison(Compare c)
    {
       if(c instanceof Shape)
        return area() == ((Shape) c).area();
       else
        return false;
       }
       
    public int sampleMethod(int y)
    {
        return 0;
        }
}
