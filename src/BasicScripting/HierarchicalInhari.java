package BasicScripting;

class College
{
	void granfather()
	{
		System.out.println("My grandfather class");
		
	}
	
}
class School extends College

{

	void parent()
	{
		System.out.println("My Parents class");
	}
	void brother()
	{
		System.out.println("My brothers class");
		
	}
	public static void main(String[]args)
	{
		System.out.println("nothing");
		
		
	}
}


public class HierarchicalInhari extends College
{
	void read()
	{
		System.out.println("I love to reading books");
	}
	public static void main(String[]args)
	{
		System.out.println("Learning Hiearchical Inheritance level");
		HierarchicalInhari m2=new HierarchicalInhari();
		m2.granfather();
		m2.read();
		School n=new School();
		n.parent();
		n.brother();
			
	}

}
