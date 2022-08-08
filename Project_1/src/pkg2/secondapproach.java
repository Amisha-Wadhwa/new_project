package pkg2;

public class secondapproach 
{
	int a,b,c,d,e;
	public void method1(int a1,int a2,int a3,int a4, int a5)
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
	public static void main(String[] args) 
	{
		secondapproach obj1=new secondapproach();
		obj1.method1(15, 256, 56, 25, 548);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		System.out.println(obj1.d);
		System.out.println(obj1.e);
	}
	
}
