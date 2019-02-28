class Out
{
    
    int b = 555;
    static int c = 537;
    static class In
    {
        int a =544;
       
        public static void main (String args[])
        {
            In objin = new In();
            
            System.out.println("from in a: "+objin.a);
            //System.out.println("from in b: "+objin.b); static class cant access the instance values from out side
            System.out.println("from in c: "+c);     

        }
    }
    class NSIn
    {
        int d = 543;
       void display()
       {
        System.out.println("from innner in d : "+d);
        System.out.println("from inner in c: "+c);
        System.out.println("from inner in b: "+b);

       }
    }
    /*NSIn objnsin = new NSIn();
   // objinsin.display();
    System.out.println(objinsin.d);
    objinsin.display();*/
    public static void main(String args[])
    {
        Out objout = new Out();
        Out.NSIn innerobj= objout.new NSIn();
        innerobj.display();
        System.out.println("from out b: "+objout.b);

    }
}