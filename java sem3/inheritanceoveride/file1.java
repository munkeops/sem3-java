class Base
{
        
    int add(int a , int b)
    {
        return a-b;
    }
}
class Derived extends Base
{
    int add( int a, int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        Derived obj = new Derived();
        System.out.println( obj.add(10,5));
        Base obj1 = new Base();
        System.out.println(obj1.add(10,5));
        
    }

}