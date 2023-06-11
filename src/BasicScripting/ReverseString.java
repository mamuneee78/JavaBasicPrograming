package BasicScripting;

public class ReverseString {

	public static void main(String[] args) {
		String Input = "Mamun";
		String Output = "";
		System.out.println("Origin String: "+ Input);
		
		
			//for (int i = 0; i < Input.length(); i++)
			for (int i= Input.length()-1; i>=0; i--) 
			Output= Output + Input.charAt(i);
			
			//for (int i1 = 0; i1 <=0; i1++) 
			System.out.println("Reverse String: " + Output);
			
		

	
	}
}
