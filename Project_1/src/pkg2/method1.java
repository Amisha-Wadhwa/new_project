package pkg2;

public class method1 
{
	public method1 ()
	{
		this (12,54,25);
		System.out.println("default method");
	}
	public method1 (int a)
	{
		System.out.println("1 parametrized method");
	}
	public method1(int a,int b)
	{
		System.out.println("2 parametrized method");
	}
	public method1(int a,int b,int c)
	{
		System.out.println("3 parametrized method");
	}
	public method1(int a,int b,int c,int d)
	{
		System.out.println("4 parametrized method");
	}
	public static void main(String[] args) 
	{
		method1 obj1=new method1();
		method1 obj2=new method1(25,14,36,84);
		method1 obj3=new method1(25);
		method1 obj4=new method1(24,56);
	}
}
