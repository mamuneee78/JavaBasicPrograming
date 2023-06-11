package BasicScripting;

import java.util.Scanner;

public class Scanner_Class_learning {

	public static void main(String[] args) {
		String Name;
		int ID;
		double payScale;
		
		boolean vaccinated;
		
		
		Scanner object= new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		Name = object.nextLine();
		
		System.out.println("Enter your ID: ");
		ID = object.nextInt();
		
		System.out.println("Enter Your PayScale: ");
		payScale = object.nextDouble();
		
		System.out.println("Are you vaccinated: ");
		vaccinated = object.nextBoolean();
		
		
		System.out.println("Thank you for your time ");
		
		
	

		

	}

}
