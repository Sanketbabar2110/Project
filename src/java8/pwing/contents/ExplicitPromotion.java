package java8.pwing.contents;

//Explicit promotion or Type casting

public class ExplicitPromotion {
	
	/**
	 * 	Explicit promotion:		-when a big size primitive data type (like int)
	 * 						is converted into small sized primitive data types 
	 * 						(like byte, Short) their is an compilation error.
	 * 							-if you want to convert anyway it can be done
	 * 						by type casting
	 * 							-Type Casting is process which convert data from
	 * 						bigger size to smaller size primitives forcefully
	 * 							-Here loss of data and JVM not assure about 
	 * 						pricision. 	
	 * **/
	
	public static void main(String[]args)
	{
		double d = 10.21;
		float f = (float)d;
		System.out.println("double to float value is		: "+f);
		
		double d1 = 199.71;
		int i = (int)d1;
		System.out.println("double to int value is			: "+i);
		
		float f1 = 12.56f;
		int i1 = (int)f1;
		System.out.println("float to int value is			: "+i1);
		
		long l = 123456789l;
		short s = (short)l;
		System.out.println("long to short value is			: "+s);
	}
}
