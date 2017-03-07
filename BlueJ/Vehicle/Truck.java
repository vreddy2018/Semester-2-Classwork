
/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    private int weight;

    public Truck()
    {
        super(18, 80);
        weight = 2000;
    }
    public Truck (int n,int m, int w)
    {
        super(n,m);
        weight = w;
    }
    
    public int getWeight()
    {
        return weight;
    }
    public void setWeight(int w)
    {
        weight = w;
    }
 
}
