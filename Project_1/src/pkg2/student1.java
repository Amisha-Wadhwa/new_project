package pkg2;

public class student1
{
	int age=25;
	int percentage=95;
	public void new1() 
	{
		System.out.println("Everday is a second chance");
	}
	public void new2() 
	{
		System.out.println("just grab the opportunity");
	}
	public static void main(String[] args)
	{
		student1 abc= new student1();
		abc.new1();
		abc.new2();
		System.out.println("age is="+abc.age);
		System.out.println("percentage is="+abc.percentage);
	}
}
