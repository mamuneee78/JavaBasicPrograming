package BasicScripting;

public class ThisCalling 
{

	ThisCalling()
	{
		System.out.println("My zero constructor");
		
	}
	
	ThisCalling(int a)
	{
		this();
		System.out.println("My 1st constructor");
		
	}
	
	ThisCalling(int a, double b)
	{
		this(4);
		System.out.println("My 2nd constructor");
		
	}
	
	ThisCalling(int a, double b, char c)
	{
		this(2,2.3);
		System.out.println("My 3rd constructor");
		
	}
	
	ThisCalling(char c, int a, double b)
	{
		this(2,2.3,'f');
		System.out.println("My 4th constructor");
		
	}
	
	ThisCalling(char c, double b, int a)
	{
		this('d', 2, 2.2);
		System.out.println("My 5th constructor");
		
	}
	
	public static void main(String[]args)
	{
		System.out.println("We love software Testing with");
		new ThisCalling('a', 1.2, 2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
