package java8.pwing.overloading;

/**
 * Priority of method calling in Overloading
 * 
 * 				FOR SINGLE PARAMETER
 * -------Primitives as a parameter-------
 * > Direct match > widenning (Implicit Promotion) > AutoBoxing
 * > AutoBoxing-Parent/Number > Object > CE
 * 
 * ---------Object as a parameter---------
 * > Direct match > Parent class > Super Parent class > Object > CE
 *  
 * -----Wrapper Object as a parameter-----
 * > Direct match > Parent class-Number > Object > AutoUnboxing
 * > (AutoUnboxing + widenning) > CE
 * 
 * ---------------null rule---------------
 * > Child > Parent > Super Parent > Object > CE 
 * **/

public class CallingSequance {
	
	void m1(int i) {
		System.out.println("int m1 method");
	}
	
	void m1(Integer i) {
		System.out.println("Integer m1 method");
	}
	
	void m1(long l) {
		System.out.println("long m1 method");
	}
	
	void m1(Long l) {
		System.out.println("Long m1 method");
	}
	
	public static void main(String[] args) {
		Integer I = 10;
		
		CallingSequance c = new CallingSequance();
		c.m1(I);
	}
}