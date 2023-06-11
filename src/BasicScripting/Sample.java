package BasicScripting;

public class Sample 
{

	static void deaf()
	{
		System.out.println("You are a deaf");
	}
	
	void blind()
	{
		System.out.println("You are a blind");
	}
	void dump()
	{
		System.out.println("You are dump");
	}
	
	public static void main(String []args)
	{
		System.out.println("We love Software Testing");
		deaf();
//		Sample P1=new Sample();
//		P1.dump();
		new Sample().dump();
//		Sample p = new Sample();
//		p.blind();
		new Sample().blind();
	}
}
