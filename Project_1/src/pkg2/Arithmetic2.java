package pkg2;

public class Arithmetic2 
{
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is"+z);
		return z;
	}
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
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
		 Arithmetic2 ob=new  Arithmetic2();
		 int subResult=ob.sub(10, 2);
		 int sumResult=ob.sum(subResult, 2);
		 int subResult1=ob.sub(sumResult, 2);
		 int mulResult=ob.mul(subResult1, 2);
		 ob.div(mulResult, 2);
	}
}
