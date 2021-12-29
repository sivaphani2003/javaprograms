import java.util.*;
interface Student
{
    abstract void getvalue();
}
interface Department
{
    abstract void getattendence();
}
class Exam implements Student,Department
{
    Scanner s=new Scanner(System.in);
    int c,atd,sno,cls;
    String sname;
    public void getvalue()
    {
        System.out.println("enter the roll no,class,name respectively");
        sno=s.nextInt();
        cls=s.nextInt();
        s.next();
        sname=s.nextLine();
        
    }
    public void getattendence()
    {
        System.out.println("enter your attendence percentage");
        atd=s.nextInt();
    }
    public void calattendence()
    {
        if(atd>75)
        {
            c=c+1;
        }
    }
    public Boolean eligible()
    {
        if(c==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class isample
{
    public static void main(String args[])
    {
        Exam e=new Exam();
        e.getvalue();
        e.getattendence();
        e.calattendence();
        Boolean g=e.eligible();
        if(g)
        {
            System.out.println("Student is Eligible");
        }
        else
        {
            System.out.println("Student is not Eligible");
        }
    }
}
