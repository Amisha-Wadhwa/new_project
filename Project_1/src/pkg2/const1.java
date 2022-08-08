package pkg2;

public class const1 
{
	public const1(int a,int b,int c,int d)
	{
		System.out.println("4 parametrized constructor");
	}
	public const1()
	{
		System.out.println("default constructor");
	}
	public const1(int a)
	{
		System.out.println("1 parametrized constructor");
	}
	public const1(int a,int b)
	{
		System.out.println("2 parametrized constructor");
	}
	public const1(int a,int b,int c)
	{
		System.out.println("3 parametrized constructor");
	}
	public static void main(String[] args) 
	{
		const1 obj=new const1(12,25,65,58);
		const1 obj1=new const1();
		const1 obj2=new const1(25);
		const1 obj3=new const1(25,65);
		const1 obj4=new const1(35,45,24);
	}
}
