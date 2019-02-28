class Employee
{
    int emp_no;
    String e_name;
    double sal;

    void get_data(int a,String b,double c)
    {
        emp_no=a;
        e_name=b;
        sal=c;
    }
    void put_data()
    {
        System.out.println("employee number : "+emp_no);
        System.out.println("employee name : "+e_name);
        System.out.println("employee salary : "+sal);

    }
}

class Allowance extends Employee
{
    /*double hrap=16/100;
    double dap=38/100;
    double tap=3/100;*/

    double hra;
    double da;
    double ta;
    
    double allow;
    void calcAllowance()
    {
        hra=0.16*sal;
        da=0.38*sal;
        ta=0.03*sal;
        allow=hra+da+ta;
    }
    void dispAllowance()
    {
        System.out.println("hra : "+hra);
        System.out.println("da : "+da);
        System.out.println("ta: "+ta);
        
    }
}
class Deductions extends Allowance
{
    double pfp=0.12;
    double ptp=0.01;
    double ded=pfp*sal+ptp*sal;

    void dispDeductions()
    {
        System.out.println("pf : "+(pfp*sal));
        System.out.println("pt : "+(ptp*sal));
    }
}
class Netsal extends Deductions
{
    double gross;
    double net;
    void dispSal()
    {
        System.out.println("gross salary : "+(sal+allow));
        System.out.println("net salary : "+(sal+allow-ded));
        
    }
    public static void main(String[] args)
    {
        Netsal obj= new Netsal();
        obj.get_data(544,"rohan", 20000);
        obj.put_data();
        obj.calcAllowance();
        obj.dispAllowance();
        obj.dispDeductions();
        obj.dispSal();
    }
}