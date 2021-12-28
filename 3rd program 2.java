import java.util.Scanner;
class time
{
int hours,min,sec;
time()
{
hours=00;
min=00;
sec=00;
}
time(int a)
{
   hours=a;
   min=00;
   sec=00;
}
time(int a,int b)
{
    hours=a;
    min=b;
    sec=00;
}
time(int h,int m,int s)
{
    hours=h;
    min=m;
    sec=s;
}
void display()
{
System.out.println("Time is "+hours+":"+min+":"+sec);
}
}
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ch,c,hours,min,sec;
System.out.println("Enter your choice:");
System.out.println("1:No parameter\n2:One parameter\n3:Two parameters\n4:Three parameters");
ch=sc.nextInt();
switch(ch)
{
case 1 :time t1=new time();
       System.out.println("Default constructor");
   t1.display();
   break;
case 2 :System.out.println("Constructor with one parameter");
        System.out.println("Enter hours :");
        hours=sc.nextInt();
        time t2=new time(hours);
        t2.display();
        break;
case 3 :System.out.println("Constructor with two parameter");
       System.out.println("Enter hours and minutes:");
       hours=sc.nextInt();
       min=sc.nextInt();
       time t3=new time(hours,min);
       t3.display();
        break;
case 4 :System.out.println("Constructor with three parameter");
       System.out.println("Enter hours,min,seconds");
       hours=sc.nextInt();
       min=sc.nextInt();
       sec=sc.nextInt();
       time t4=new time(hours,min,sec);
       t4.display();
       break;
default:System.out.println("Enter a valid choice");
   break;
}
}
}
