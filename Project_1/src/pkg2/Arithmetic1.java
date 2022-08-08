package pkg2;

public class Arithmetic1
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is"+z);
		return z;
	}
	public int mul(int d,int e)
	{
		int f;
		f=d*e;
		System.out.println("mul result is"+f);
		return f;
	}
	public int div(int u,int v)
	{
		int w;
		w=u/v;
		System.out.println("div result is"+w);
		return w;
	}
	public static void main(String[] args) 
	{
		Arithmetic1 ob=new Arithmetic1();
		int sumResult=ob.sum(10, 2);
		int sumResult1=ob.sum(sumResult,2);
		int subResult=ob.sub(sumResult1,2);
		int mulResult=ob.mul(subResult, 2);
		ob.div(mulResult,2);
		
	}
}
