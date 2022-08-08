package pkg2;

public class class3 
{
	public class3()
	{
		System.out.println("Default Constructor");
	}
	public class3(int a)
	{
		this();//it will call default constructor
		System.out.println("one parametrized Constructor");
	}
	public class3(int a, int b)
	{
		this(256); //it will call one parametrized
		System.out.println("two parametrized Constructor");
	}
	public static void main(String[] args)
	{
		class3 ref1=new class3(123,25);//control will go to 2 parametrized constructor
	}
}
