package BasicScripting;

class ConstructorInJava 
{
	
	
	ConstructorInJava()
	{
		System.out.println("Non parameterized Constructor");
	}
	
	ConstructorInJava(int a)
	{
		this();
		System.out.println("First Constructor");
		
	}
	
	ConstructorInJava(int a, double b)
	{
		this(1);
		System.out.println("Second Constructor");
		
	}
	
	ConstructorInJava(char c, double d, int a)
	{	
		this( 2, 3.4);
		System.out.println("Third Constructor");
	}
	
	
		


	public static void main(String[]arge)
	{
		System.out.println("We Love to learn JAVA with");
		new ConstructorInJava('e', 3.2, 2);
//		new ConstructorInJava(1);
//		new ConstructorInJava(1,0.01);
//		new ConstructorInJava('a', 0.02, 1);
	
	}
	

}
