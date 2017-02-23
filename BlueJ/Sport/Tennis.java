/**
* Authors: Ami, Neil, Dhruv
* This class calls the super class sports
*/
public class Tennis extends Sports
{
    /**
	* Default constructor. Takes in no parameters
	* Calls super
	*/
    public Tennis()
    {
        super();
    }
    /**
	* Overloaded constructor
	* This constructor takes in the season, equipment, number of players, and number of teams for tennis and calls the super
	* @param String s - the season of the sport
	* @param String e - the equipment for the sport
	* @param int p - the number of players
	* @param int t - the number of teams
	*/
    public Tennis(String s, String e, int p, int t)
    {
        super(s,e,p,t);
    }

}
