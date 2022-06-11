package java8.pwing.contents;

public class AutoBoxing {
	public static void main(String[]args)
	{
		byte b = 100;
		Byte B = b;
		
		int i = 25;
		Integer I = i;
		
		short s = 127;
		Short S = s;
		
		long l = 987654l;
		Long L = l;
		
		float f = 19.97f;
		Float F = f;
		
		double d = 1011.97;
		Double D = d;
		
		char c = 'S';
		Character C = c;
		
		/**
		 * 	AutoBoxing :		when a primitive data types is converted into
		 * 				corresponding wrapper class it is called as AutoBoxing.
		 * 
		 * Wrapper Class : 		To represent primitive data types in object form
		 * 				java creates some class such class is called as Wrapper classes 
		 *
		 * **/
		
		System.out.println("Byte value is		: "+B);
		System.out.println("Integer value is	: "+I);
		System.out.println("Short value is		: "+S);
		System.out.println("Long value is		: "+L);
		System.out.println("Float value is		: "+F);
		System.out.println("Double value is		: "+D);
		System.out.println("Character value is	: "+C);
	}

}
