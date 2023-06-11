package BasicScripting;

public class Logical_Operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		
		if (a<11 && b>14) 
		{
			System.out.println("We are learning AND operator");
			
		}
		
		if (a<5 || b<16) 
		{
			System.out.println("We are learning OR operator");
			
		}
		if (!(a<5 || b>16))
		{
			System.out.println("We are learning NOT operator");
			
		}
		else
		{
			System.out.println("Condition is not true");
		}

	}

}
