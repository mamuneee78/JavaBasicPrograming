package BasicScripting;

public class StaticInNonStatic {

	public static void main(String[] args) {

		System.out.println("Software Testing");
		two();
		StaticInNonStatic s = new StaticInNonStatic();
		s.three();
		

	}

	static void two()

	{
		System.out.println("Reza Loves Software Testing");
	}

	void three()

	{
		System.out.println("We Loves Software Testing");
	}
}
