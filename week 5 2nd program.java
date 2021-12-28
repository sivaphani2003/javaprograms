import java.util.Scanner;
class figure
{
    float area()
    {
        System.out.println("area method in super class figure");
        return 0;
    }
}
class rectangle extends figure
{
    Scanner sc=new Scanner(System.in);
    float area()
    {
        int l,b;
        l=sc.nextInt();
        b=sc.nextInt();
        return l*b;
    }
}
class triangle extends figure
{
    Scanner sc1=new Scanner(System.in);
    float area()
    {
        int b,h;
        b=sc1.nextInt();
        h=sc1.nextInt();
        return (float)(0.5*h*b);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc1= new Scanner(System.in);
		int ch;
		System.out.println("Enter your choice 1:rectangle 2:triangle");
		ch=sc1.nextInt();
		if(ch==1)
		{
		    System.out.println("Enter the length and breadth of the triangle");
		    rectangle r=new rectangle();
		    float x= r.area();
		    System.out.printf("area of rectangle is %.2f\n",x);
		}
		else if(ch==2)
		{
		    triangle t=new triangle();
		    System.out.println("Enter the breadth and height of the triangle");
		    double d=t.area();
		    System.out.printf("area of triangle is %.2f\n", d);
		}
		else
		{
		    System.out.println("please enter the correct choice\n");
		}
	}
}
