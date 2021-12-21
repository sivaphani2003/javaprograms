import java.util.*;
class employee
{
    Scanner sc=new Scanner(System.in);
    String name,id;
    double salary;
    void reademp()
    {
        name=sc.next();
        id=sc.next();
        salary=sc.nextDouble();
    }
    
}
class permenant_employee extends employee
{
    double s;
    
    void printemp()
    {
        reademp();
        s=salary;
        System.out.println("This is the details of permanent employee");
        s=s+(0.5*salary);
        System.out.printf("The salary with 5 percentage increment of the %s", name);
        System.out.printf(" is %.2f\n",s);    
        
    }
    
}
class temporary_employee extends employee
{
    double s;
    void printemp()
    {
        reademp();
        s=salary;
        System.out.println("This is the details of temporary employee");
        s=s+(0.35*salary);
        System.out.printf("The salary with 3.5 percentage increment of the %s", name);
        System.out.printf(" is %.2f\n",s);
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		int ch;
		System.out.println("Enter your choice 1:permanent employee 2:temporary employee");
		ch=sc1.nextInt();
		if(ch==1)
		{
		    permenant_employee p1=new permenant_employee();
		    p1.printemp();
		}
		else if(ch==2)
		{
		    temporary_employee p2=new temporary_employee();
		    p2.printemp();
		}
		else
		{
		    System.out.println("please enter the correct choice");
		}
	}
}
