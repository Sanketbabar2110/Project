package java8.pwing.contents;

public class MethodCalling {

	double r = 10;

	static int sum()
	{
		int a = 10;
		int b = 20;
		System.out.println("\nAddition of a and b : "+(a+b));
		
		return (a+b);
	}
		
	double area()
	{
		double A = 3.142*r*r;
		System.out.println("\nArea of circle : "+A);
		
		return A;
	}
	
	public static void main(String[] args) 
	{
		int s = MethodCalling.sum();
		System.out.println("The sum of a and b as a return value : "+s);
		
		
		MethodCalling Z = new MethodCalling();
		double z = Z.area();
		System.out.println("Area of a circle as a return value : "+z);
		
	}
}
