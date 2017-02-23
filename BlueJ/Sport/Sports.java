/**
* Authors: Ami, Neil, Dhruv
* This class creates a sport
*/
public class Sports
{
    /**
	* Nonstatic class field that is the season of the sport as a string
	*/
    private String season;
    
    /**
	* Nonstatic class field that is the equipment of the sport
	*/
    private String equipment;
    
    /**
	* Nonstatic class field that is the number of players on a team
	*/
    private int players;
    
    /**
	* Nonstatic class field that is the number of teams in the game
	*/
    private int teams;
    
    /**
	* Default constructor. Takes in no parameters
	* Sets defaults
	*/
    public Sports()
    {
        season = "Fall";
        equipment = "Ball";
        players = 1;
        teams = 2;
    }
    
    /**
	* Overloaded constructor
	* This constructor takes in the season, equipment, number of players, and number of teams for the sport
	* @param String s - the season of the sport
	* @param String e - the equipment for the sport
	* @param int p - the number of players
	* @param int t - the number of teams
	*/
    public Sports(String s, String e, int p, int t)
    {
        season = s;
        equipment = e;
        players = p;
        teams = t;
    }
    
    /**
	* Season accessor
	* @return - String season - the season of the sport
	*/
    public String getSeason()
    {
        return season;
    }
    /**
	* Equipment accessor
	* @return - String equipment - the equipment of the sport
	*/
    public String getEquipment()
    {
        return equipment;
    }
    /**
	* Players accessor
	* @return - int players - the number of players per team
	*/
    public int getPlayers()
    {
        return players;
    }
    /**
	* Teams accessor
	* @return - int teams - the number of teams
	*/
    public int getTeams()
    {
        return teams;
    }
    
    /**
	* Returns the season, equipment, number of players, and number of teams in readable format
	* @return String - the fields of Sport in readable format
	*/
    public String toString()
    {
        return "Season: " + season + ", equipment; " + equipment + "\n Players: " + players +", teams: " + teams;
    }
    
    /**
	* Returns the total players for the sport by multiplying the teams by the players
	* @return int - the total players
	*/
    public int totalPlayers()
    {
        return teams*players;
    }
    
    /**
	* Compares the total number of players in a sport and returns true if they are equal
	* @return boolean true - if total players is the same
	* @return boolean false - if total players is not the same
	*/
    public boolean equals(Sports s)
    {
        return this.totalPlayers() == s.totalPlayers();
    }
    /**
	* Compares the seasons of the sports and returns true if they are the same
	* @return boolean true - if season is the same
	* @return boolean false - if season is not the same
	*/
    public boolean equals(String season)
    {
        return season.equals(this.season);
    }
}
