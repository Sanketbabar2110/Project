package java8.pwing.contents;

//implicit promotion also known as widening

public class ImplicitPromotion {
	
	static byte b = 127;
	static short s = b;
	static int i = s;
	static long l = i;
	static float f = l;
	static double d = f;
	
	static char c = 'S';
	static String str = Character.toString(c) ;
	
	/**
	 * Implicit Promotion : 		when small sized primitive data types(like byte, short)
	 * 						converted into bigger sized primitive data types (like int)
	 * 						JVM does it automatically called as implicit promotion.
	 * **/

	public static void main(String[]args)
	{ 
		System.out.println("value of byte 		: "+b);
		System.out.println("value of short		: "+s);
		System.out.println("value of int 		: "+i);
		System.out.println("value of long		: "+l);
		System.out.println("value of float 		: "+f);
		System.out.println("value of double 	: "+d);
		System.out.println("value of char 		: "+c);
		System.out.println("value of String 	: "+str);
	}
}
