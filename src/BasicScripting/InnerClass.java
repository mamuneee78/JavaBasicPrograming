package BasicScripting;

     class OuterClass {
	  int x = 10;
     }

	  class MyClass {
	    int y = 5;
	  }
	



public class InnerClass {

	public static void main(String[] args) {
		OuterClass OC=new OuterClass();
		MyClass IC =new MyClass();
		
		System.out.println(IC.y + OC.x);
		
		System.out.println(IC.y - OC.x);
		
	}

}
