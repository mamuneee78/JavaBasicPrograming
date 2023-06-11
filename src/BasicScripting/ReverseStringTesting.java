package BasicScripting;

public class ReverseStringTesting {

	public static void main(String[] args) {
		
		String Input = "Mamun";
	    String Output = "";
	    System.out.println("Original String: " + Input);
	    
	    for (int i = Input.length()-1; i>=1; i++)
	    	Output= Output + Input.charAt(i);
	    
	    	
	    	System.out.println("Reverse String: " + Output);
				

	}

}

