 package BasicScripting;

import java.util.Scanner;

public class Scanner_class {
	public static void main(String[]arge) {
		String name;
		int age;
		double salary;
		
		Scanner obj = new Scanner(System.in); // To create an object 
		
		System.out.println("Enter Name, age and salay one by one");
		
		System.out.println("Enter Name:");
		name = obj.nextLine(); //Input String value
		
		System.out.println("Enter age:");
		age = obj.nextInt(); // Input integer value
		
		System.out.println("Enter salary:");
		salary = obj.nextDouble(); // Input Double value
		
		System.out.println("Enter name: " + name);
		
		System.out.println("Enter age: " + age);
		
		System.out.println("Enter salary: " + salary);
		
		
	}

}

//public class Scanner_class {
//	public static void main(String[]args) {
//		int a, b, sum;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter First Number: "); 
//		a= sc.nextInt();
//		
//		System.out.println("Enter Second Number: ");
//		b= sc.nextInt();
//		sc.close();
//		sum = a+b;
//		System.out.println("Sum of these number: " +sum);
//		
//		
//		
//	}
//	
//}




