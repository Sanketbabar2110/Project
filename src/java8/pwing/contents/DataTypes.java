package java8.pwing.contents;

public class DataTypes {
	
	static byte B = 125;	
	static short s = 1000;  	
	static int i = 1234567891;	
	static long l = 1234567891123456789l;
	
	static float f =6.1234567f;
	static double d = 6.123456789112345;
	
	static char c = 'S';	 
	static boolean b = true ;	
	
	/**
	 * byte    ---> 	Size: 1 byte		Range: -128 to 127
	 * short   --->		Size: 2 byte		Range: -32768 to 32767
	 * int     --->		Size: 4 byte		Range: -2147483648 to 2147483647
	 * long    --->		Size: 8 byte		Range: upto 19 digits 
	 * 
	 * float   --->		Size: 4 byte		Range: upto 7 decimal digits
	 * double  --->		Size: 8 byte		Range: upto 15 decimal digits
	 * 
	 * char    --->		Size: 2 byte		Range: 0 to 65535
	 * boolean --->		size: 1 bit			True or False 	***Default it is false
	 * 
	 * Bydefault vlues of Primitives of decimal and integer are double and int
	 * that's why we add suffix 'f' or 'F' for float and 'l' or 'L' for long.
	 * 
	 **/
	
	public static void main(String[] args) {
		
		System.out.println("\tbyte : "+B);
		System.out.println("\tshort : "+s);
		System.out.println("\tint : "+i);
		System.out.println("\tlong : "+l);
		System.out.println("\tfloat : "+f);
		System.out.println("\tdouble : "+d);
		System.out.println("\tcharacter : "+c);
		System.out.println("\tDefault scope of boolean datatype is false -->"+b);
	}

}
