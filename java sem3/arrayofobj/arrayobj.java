class Student
{
    int roll_no;
   // String name;
    double CGPA;

    public static void main(String args[])
    {
        Student objarr[] = new Student[10];
        for(int i=0;i<10;i++)
        {
            objarr[i]= new Student();
        }
        for(int i=0;i<10;i++)
        {
            objarr[i].roll_no=500 +i;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(objarr[i].roll_no);
        }
    }
    
}