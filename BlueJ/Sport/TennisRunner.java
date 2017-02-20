
/**
 * Write a description of class TennisRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
