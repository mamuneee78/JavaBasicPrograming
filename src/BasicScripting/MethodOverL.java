package BasicScripting;

public class MethodOverL {
	
	void school(int a)
	{
		System.out.println("My 1st non static method");
	}
	
	static void school(int a, double b)
	{
		System.out.println("My 2nd static method");
	}
	static void school(int a, char c)
	{
		System.out.println("My 3rd static method");
	}
	void school(double b, char c)
	{
		System.out.println("My 4th non static method");
	}
	void school(char c, int a, double b)
	{
		System.out.println("My 5th non static method");
	}
	
	public static void main(String[]args) throws InterruptedException
	{
		System.out.println("My all method togethher");
		MethodOverL m1=new MethodOverL();
		
		m1.school(1);
		school(2,2.2);
		school(1,'n');
		
		Thread.sleep(5000);
		
		m1.school(2.2,'f');
		
		Thread.sleep(5000);
		m1.school('n', 4, 4.2);
	
	}
	
}
