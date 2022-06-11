package java8.pwing.contents;

/**
 *	instanceOf :	It will check if the reference variable is an Object
 *				of given class/subclass/interface   
 * **/

class FaceBook{
}

public class InstaOf extends FaceBook {
	
	public static void main(String[] args) 
	{	    
		String s = "Ram";
	    
		FaceBook F = new FaceBook();
		
		InstaOf I = new InstaOf();
		
		System.out.println(s instanceof String);
		 
		System.out.println(F instanceof FaceBook);
			
		System.out.println(I instanceof FaceBook);
		
		System.out.println(F instanceof InstaOf);
		
		System.out.println(I instanceof Object);
		
		System.out.println(F instanceof Object);
	}	
}
