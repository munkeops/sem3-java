interface Vehicle
{
    public double vp =5/100;
   //double vp;
    public void vloan(double income);
   
    
}
interface Home
{
    public double hp =10/100;
    public void hloan(double income);
    
}
interface Personal
{
    public double pp =15/100;
    public void ploan(double income);
    
}

class Bank implements Vehicle,Home,Personal
{
    double vp=0.05;
    public void vloan(double income)
    {
        double loan=vp*income;
        System.out.println(loan);    }

    double hp=0.05;
    public void hloan(double income)
    {
        double loan=hp*income;
        System.out.println(loan);    }

    double pp=0.05;
    public void ploan(double income)
    {
        double loan=pp*income;
        System.out.println(loan);
    }
    public static void main(String args[])
    {
        Bank obj = new Bank();
        obj.vloan(20000);
        obj.hloan(20000);
        obj.ploan(20000);

    }
}