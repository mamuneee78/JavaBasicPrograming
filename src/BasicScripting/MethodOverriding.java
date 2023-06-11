

package BasicScripting;

class Mamun {
	void Faizan()
	{
		System.out.println("Dusto Sele");
		
	}
}


class Reza extends Mamun
{
	void Faizan()
	{
		System.out.println("Posa sele");
	}
}
class Sohag extends Reza
	{
	void Faizan() {
		System.out.println("Those are very close");
		
	}
}
public class MethodOverriding {
	public static void main(String[]agrs)
	{
		Reza s= new Reza();
		s.Faizan();
//		Sohag m= new Sohag();
//		m.Faizan();
		
	}

}
