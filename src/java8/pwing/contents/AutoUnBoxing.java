package java8.pwing.contents;

public class AutoUnBoxing {
	public static void main(String[]args)
	{
		/**
		 * AutoUnBoxing : 		When an a Object of any wrapper class 
		 * 				converted into it's corresponding primitives
		 * 				it is called as Auto-UnBoxing.
		 * **/
		Integer I = new Integer(15);
		int i = I;
		System.out.println("primitive int : "+i);
		
		Long L = new Long(123456);
		long l = L;
		System.out.println("primitive long : "+l);
		
		Float F = new Float(10.21);
		float f = F;
		System.out.println("primitive float : "+f);
		
		Double D = new Double(2110.7991);
		double d = D;
		System.out.println("primitive double : "+d);
		
		Character C = new Character('S');
		char c = C;
		System.out.println("primitive char : "+c);
	}

}
