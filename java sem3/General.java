class General
{

    int factorial(int a)
    {
        int f=1;
        int i;
        for(i=1;i<=a;i++)
        {
            f*=i;
        }
        return f;
    }
    
    public static void main(String args[])
    {
        General obj1 = new General();
        int k=obj1.factorial(5);
        System.out.println("factorial 5 is : "+ k );
    }     
    
}