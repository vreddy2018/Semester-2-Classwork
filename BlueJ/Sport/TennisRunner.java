/**
* Authors: Ami, Neil, Dhruv
* This class is the runner file for sports
*/
public class TennisRunner
{
    public static void main(String[] args)
    {
        Tennis t = new Tennis("hello","bnye",1,1);
        System.out.println(t);
        Tennis t1 = new Tennis();
        System.out.println(t1);
        System.out.println(t1.totalPlayers());
    }
 
}
