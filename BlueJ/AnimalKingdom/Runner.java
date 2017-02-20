
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
        /* Animal a = new Animal();
        Human h = new Human();
        System.out.println(h.getAge());
        
        Vehicle v = new Vehicle();
        String s = v.toString();
        System.out.println(v);
         System.out.println("-----");
        
        Square s1 = new Square();
        Square s2 = new Square();
        System.out.println(s1);
        System.out.println(s2);
        String sqStr = s1.toString();
        System.out.println(sqStr);
        
        System.out.println(s1.equals(s2));
        System.out.println("-----");
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("-----");
        
        Square s3 = new Square(4);
        Rectangle r1 = new Rectangle();
        System.out.println(s3.area());
        System.out.println(r1.area());*/
        Animal a = new Animal();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Object);
        
        Human h = new Human();
        Reptile r = new Reptile();
        Amphibian am = new Amphibian();
        System.out.println(h instanceof Human);
        System.out.println(h instanceof Object);
        System.out.println(h instanceof Animal);
        
        
        //System.out.println(h instanceof Reptile);
        System.out.println(r instanceof Object);
        System.out.println(am instanceof Animal);
        //System.out.println(am instanceof Human);
        System.out.println(a instanceof Human);
        
        Square sq = new Square();
        Rectangle rt = new Rectangle();
        System.out.println(sq instanceof Rectangle);
        System.out.println(rt instanceof Square);
        
        Square1 sq1 = new Square1();
        Rectangle1 rt1 = new Rectangle1();
        System.out.println(sq1 instanceof Rectangle1);
        System.out.println(rt1 instanceof Square1);
        
        sq1.setSideLength(3);
        System.out.println(sq1);
        System.out.println(sq1.area());
        
        System.out.println(sq1.equals(rt1));
        
        Square1 sq2 = new Square1(3);
        Square1 sq3 = new Square1(3);
        System.out.println(sq1.equals(sq2));
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq2.equals(sq3));
        
        Rectangle1 rt2 = new Rectangle1(2,3);
        Rectangle1 rt3 = new Rectangle1(2,3);
        System.out.println(rt2.equals(rt3));
    }
}
