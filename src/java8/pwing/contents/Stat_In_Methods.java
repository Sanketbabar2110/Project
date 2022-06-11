package java8.pwing.contents;

public class Stat_In_Methods {
	
	/**
	 * Methods : 	Methods are the bunch of the statements having signature
	 * 
	 *	Static method 	: 		-called with class name reference or directly in same class
	 * 							-stored in method area
	 * 
	 * 	instance method	:	 	-called with object reference only 
	 * 							-stored in heap area
	 * 
	 * 		NOTE : methods must have return type
	 * 
	 * **/

		  static void myMethod1() 
		  {
			  System.out.println("\nmyMethod1 starts here...");
			  System.out.println("myMethod1 ends here...");
		  }
		  
		  void myMethod2()
		  {
			  System.out.println("\nmyMethod2 starts here...");
			  System.out.println("myMethod2 ends here..."); 
		  }

		  public static void main(String[] args)
		  {
			  System.out.println("main method starts here...");
			  
			  myMethod1();
			  
			  Stat_In_Methods m1 = new Stat_In_Methods();
			  m1.myMethod2();
			  
			  System.out.println("\nmain method ends here...");
		  }
}