class Inbuilt
{
    public static void main(String args[])
    {
       // System.out.println(10/0);
        
        try 
        {
            System.out.println("lets learn to divide");
            
            System.out.println(10/0);
            System.out.println("oh shit we coudnt");

        }
        catch(ArithmeticException e)
        {
            System.out.println("cant divide by zero ");
        }
       
        
        System.out.println("\n\n");
       
        try 
        {
            System.out.println("lets learn to divide");

            System.out.println(11/0);
            System.out.println("oh shit we coudnt");

        }
        catch(Exception e)
        {
            System.out.println("cant divide by zero ");
      
        }
        finally
        {
           
            System.out.println("oh shit we coudnt");

        }
    }
}