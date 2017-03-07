
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Animal
{
     private String hairColor;
    
    public Human(int a, String hc)
    {
        super(a);
        hairColor = hc;
    }
    
    public Human()
    {
        super();
        hairColor = "";
    }
    public String getHairColor()
    {
        return hairColor;
    }
    public void printSomething()
   {
        System.out.println("This is a human");
    }
}
