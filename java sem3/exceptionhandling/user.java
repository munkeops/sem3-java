class User
{
    static void agechecker(int age)
    {
        if (age<18)
        {
            throw new ArithmeticException("Access denied age cannot be below 18");
        }

    }
    public static void main(String args[])
    {
           User.agechecker(17);     
    }
}