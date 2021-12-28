import java.util.Scanner;
class employee
{
    //NumberFormat nf=NumberFormat.getCurrencyInstance();
    String name,id,designation;
    int BP,HRA,DA,PF,NP;
    Scanner sc1 = new Scanner(System.in);
    void reademp()
    {
        name=sc1.next();
        id=sc1.next();
        designation=sc1.next();
    }
    
}
class salary extends employee
{
    Scanner sc2 = new Scanner(System.in);
    void readsalary()
    {
        BP=sc2.nextInt();
        HRA=sc2.nextInt();
        DA=sc2.nextInt();
        PF=sc2.nextInt();
    }
    void calculatesalary()
    {
        NP=BP+HRA+DA-PF;
    }
    void displayemp()
    {
        //System.out.printf("The name,id,resignation of the employee is %s %s %s",name,id,resignation);
        
        System.out.println("The salary is: ");
        System.out.printf("%d\n",NP);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("enter the no of employees in your company");
        n=sc.nextInt();

        salary[] arr;
        arr=new salary[n];
        int x=1,ch;
        for(i=0;i<n;i++)
        {
            System.out.printf("enter the details of %d employee",x);
            System.out.println();
            arr[i]= new salary();
            System.out.println("enter the following elements in order as name,id,resignation in one line seperated with space");
            arr[i].reademp();
            System.out.printf("enter the bp,hra,da,pf of %d th employee\n",x);
            arr[i].readsalary();
            arr[i].calculatesalary();
            arr[i].displayemp();
            x++;
        }
    }
}
