
/**
 * Write a description of class Sports here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sports
{
    private String season;
    private String equipment;
    
    public Sports()
    {
        season = "Fall";
        equipment = "Ball";
    }
    
    public Sports(String s)
    {
        season = s;
    }
   
    public Sports(String s, String e)
    {
        season = s;
        equipment = e;
    }
    
    public String getSeason()
    {
        return season;
    }
    
    public String getEquipment()
    {
        return equipment;
    }
    
    public String toString()
    {
        return "Season: " + season + ", equipment; " + equipment;
    }
    
    public double totalplayers()
    {
    return 0;}

}
