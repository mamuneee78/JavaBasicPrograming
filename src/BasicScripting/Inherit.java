package BasicScripting;
 
class Madrasa
{
	void Quran()
	{
		System.out.println("Learning Quran is mandetory for Muslims");
		
	}
	
}
class Collage extends Madrasa
{
	void granfather()
	{
		System.out.println("My grandfather class");
		
	}
	
}

class School1 extends Collage
  
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



class Inherit extends School1
{
	
	void play()
	{
		System.out.println("My Child class");
		
	}
	void pray() 
	{
		System.out.println("Pray 5 times salah is farj");
		
	}
	public static void main(String[]args)
	{
		System.out.println("We learning Inheritance");
		
		Inherit a = new Inherit();
		a.Quran();
		a.parent();
		a.play();
		a.pray();
		a.granfather();
	}

}

