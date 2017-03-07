
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehicle implements Comparable<Vehicle>
{
   private int numWheels;
   private int maxSpeed;
   
   public Vehicle()
   {
       numWheels = 1;
       maxSpeed = 100;
    }
    
   public Vehicle(int w,int m)
   {
       numWheels = w;
       maxSpeed = m;
    }
   
   public int getNumWheels()
   {
       return numWheels;
    }
   public int getMaxSpeed()
   {
       return maxSpeed;
    }
    
   public void setNumWheels(int n)
   {
       numWheels = n;
    }
   public void setMaxSpeed(int m)
   {
       maxSpeed = m;
    }
}
