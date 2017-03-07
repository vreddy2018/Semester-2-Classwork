
/**
 * Write a description of class Bike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
   private int passengers;
   public Bike()
   {
       super(2,120);
       passengers = 2;
    }
   public Bike (int n,int m, int p)
   {
       super(n,m);
       passengers = p;
    }
    
    public int getPassengers()
    {
        return passengers;
    }
    public void setPassengers(int p)
    {
        passengers = p;
    }
}
