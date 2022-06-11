package java8.pwing.contents;

public class SimpleInterest {

	double simple_interest;

	String bank(String str) 
	{
		return str;
	}
	double simple(int p, double r, double t) 
	{
		simple_interest = p*r*t/100;
		System.out.println("Principle	 : "+p+"\nRate of interest : "+r+"%\nTime		 : "+t);
		return simple_interest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterest z = new SimpleInterest();
		
		System.out.println("Bank Name 	 : "+z.bank("State Bank of India"));
		System.out.println("Simple Interest	 : "+z.simple(10000,10,2));
	}
	

}
