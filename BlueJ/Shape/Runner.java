
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args)
    {
        Shape [] arr  = new Shape[3];
        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Triangle();
        
        for (Shape sh: arr)
            System.out.println(sh.area());
         /**   
        Shape sh1 = new Circle();
        if (sh1 instanceof Circle)
            ((Circle) sh1).getRadius();
    */
   
   
         Compare c = new Circle();
          Compare c1 = new Circle();
          Circle c2 = new Circle();
          System.out.println(c2 instanceof Compare);
          
          System.out.println(((Circle)c).area());
          System.out.println(((Circle)c1).area());
          System.out.println(c.comparison(c1));
          System.out.println(c.comparison(c2));
          Compare s = new Rectangle();
          s.sayHi();
        
   
    }
}
