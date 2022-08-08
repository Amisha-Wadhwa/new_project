package pkg2;

public class class4 
{
	public void m1()
	{
		System.out.println("method 1");
	}
	public void m2()
	{
		this.m1(); //calling method1
		System.out.println("method 2");
		this.m3(); //calling m3
	}
	public void m3()
	{
		System.out.println("method 3");
	}
	public static void main(String[] args) 
	{
		class4 obj=new class4();
		obj.m2();  //calling m2
	}
}
