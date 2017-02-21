
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
    private int players;
    private int teams;
    
    public Sports()
    {
        season = "Fall";
        equipment = "Ball";
        players = 1;
        teams = 2;
    }
    
    public Sports(String s, String e, int p, int t)
    {
        season = s;
        equipment = e;
        players = p;
        teams = t;
    }
    
    public String getSeason()
    {
        return season;
    }
    
    public String getEquipment()
    {
        return equipment;
    }
    
    public int getPlayers()
    {
        return players;
    }
    public int getTeams()
    {
        return teams;
    }
    public String toString()
    {
        return "Season: " + season + ", equipment; " + equipment + "\n Players: " + players +", teams: " + teams;
    }
    
    public int totalPlayers()
    {
        return teams*players;
    }
    public boolean equals(Sports s)
    {
        return this.totalPlayers() == s.totalPlayers();
    }
    public boolean equals(String season)
    {
        return season.equals(this.season);
    }
}
