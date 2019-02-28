class Inbuilt2
{
    public static void main(String args[])
    {

        try 
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cant divide by zero ");
      
        }
        catch(Exception e)
        {
            System.out.println("cant divide by zero :P ");
      
        }
        /*
        try 
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println("cant divide by zero ");
      
        }
        catch(ArithmeticException e)
        {
            System.out.println("cant divide by zero ");
      
        }*/


    }
}