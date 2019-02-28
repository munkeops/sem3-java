import java.util.StringTokenizer;

class Stringbuff
{
    public static void main(String args[])
    {
        StringBuffer s = new StringBuffer("rohan");
        System.out.println("val : "+s);
        System.out.println("length : "+s.length());
        System.out.println("capacity : "+s.capacity());
        System.out.println("apend surname : "+s.append(" nedungadi"));
        System.out.println("insert middle name : "+s.insert(6,"russel "));
        System.out.println("character at position 6: "+s.charAt(6));
        System.out.println("position of middle name: "+s.indexOf("russel"));
        System.out.println("delte middle name : "+s.delete(6,13));      
        System.out.println("reverse : "+s.reverse());        
      


        StringTokenizer s1 = new StringTokenizer("rohan is the king of this world","aeiou");
        while(s1.hasMoreTokens())
        {
            System.out.println(s1.nextToken());
        }
        
    }
}