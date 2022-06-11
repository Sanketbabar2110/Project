package java8.pwing.contents;

public class Stat_In_Variables {

	static String name = "Apple Inc.";
	static String os = "ios";
	
	String model;
	int price;
	short launching_year;
	
	/**
	 * 	Static variable : 		-Scope of static variable is same as '.class' file
	 * 							-called with class name reference or directly in same class
	 * 							-it is same for all objects
	 * 							-stored in method area
	 * 
	 * 	instance variable : 	-Scope of instance variable is same as scope of 'object'
	 * 							-called with object reference only 
	 * 							-it is different for different objects i.e. separate copy of 
	 * 							   instance variable for each object is created 
	 * 							-stored in heap area
	 * 
	 * **/
	public static void main(String[] args) {
		
		Stat_In_Variables I1 = new Stat_In_Variables();
		I1.model = "Iphone 11";
		I1.price = 52700;
		I1.launching_year = 2019; 
				
		Stat_In_Variables I2 = new Stat_In_Variables();
		I2.model = "Iphone 12";
		I2.price = 60990;
		I2.launching_year = 2020;
		
		Stat_In_Variables I3 = new Stat_In_Variables();
		I3.model = "Iphone 13";
		I3.price = 124700;
		I3.launching_year = 2021;
		
		System.out.println("Name of the company : "+Stat_In_Variables.name);
		System.out.println("Operating System : "+Stat_In_Variables.os);
		System.out.println("\nmodel : "+I1.model);
		System.out.println("price : "+I1.price);
		System.out.println("launching year : "+I1.launching_year);
		
		System.out.println("\nmodel : "+I2.model);
		System.out.println("price : "+I2.price);
		System.out.println("launching year : "+I2.launching_year);
		
		System.out.println("\nmodel : "+I3.model);
		System.out.println("price : "+I3.price);
		System.out.println("launching year : "+I3.launching_year);
	}
}
