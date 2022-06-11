package java8.pwing.contents;

public class DefaultValues {
	
	static byte b;
	static short s;
	static int i;
	static long l;
	
	static float f;
	static double d;
	
	static char c;
	static boolean bl;
	
	static String name;
	
	/**
	 * byte    ---> 	0
	 * short   --->		0
	 * int     --->		0
	 * long    --->		0 
	 * 
	 * float   --->		0.0
	 * double  --->		0.0
	 * 
	 * char    --->		\u0000 and blank space
	 * boolean --->		false
	 * 
	 * String  --->		null 
	 **/
	
	public static void main(String[]args)
	{
		System.out.println("Default value of byte 		: "+b);
		System.out.println("Default value of short		: "+s);
		System.out.println("Default value of int		: "+i);
		System.out.println("Default value of long 		: "+l);
		System.out.println("Default value of float 		: "+f);
		System.out.println("Default value of double 	: "+d);
		System.out.println("Default value of char 		: "+c);
		System.out.println("Default value of boolean 	: "+bl);
		System.out.println("Default value of String 	: "+name);
	}

}
