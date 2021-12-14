class student
{
	int a,b,c;
	student()
	{
		System.out.println("Hello student");
	}
	student(int a,int b,int c)
	{
		this();
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void m()
	{
		System.out.println("Hello m");
	}
	void n()
	{
		System.out.println("Hello n");
		this.m();
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class thisdemo
{
	public static void main(String args[])
	{
		student s=new student(1,2,3);
		s.n();
		s.display();
	}
}
