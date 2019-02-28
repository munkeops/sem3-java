class Employee
{
    int eno;
    String ename;
    Employee()
    {
        eno=544;
        ename="rohan";
    }
    Employee(int a , String b)
    {
        eno = a;
        ename = b;
    }
    Employee(Employee e)
    {
        eno = e.eno;
        ename = e.ename;
    }
    void display()
    {
        System.out.println("number is : "+ eno);
        System.out.println("name is : "+ ename);

    }
    public static void main(String[] args)
    {
        
    }
    
}

class Conduct
{
    public static void main(String[] args)
    {
        Employee obj1 = new Employee();
        Employee obj2 = new Employee(555, " raghav");  
        Employee obj3 = new Employee(obj2);  


        obj1.display();
        obj2.display();
        obj3.display();

    }
}