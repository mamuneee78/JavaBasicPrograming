package BasicScripting;

class Shohan {
  Shohan()

{  
	System.out.println("Shohan Beta");
}
}
class Mahi extends Shohan{
	  Mahi()

	{
		 
		System.out.println("Mahi Buri");
	}
	}
class Faizan extends Mahi{
	  Faizan()
	  

	{
		 
		System.out.println("Faizan pagol");
	}
	}
class SuperCalling {
	
	public static void main(String[]agrs)
	{
		new Faizan();
	}

}
