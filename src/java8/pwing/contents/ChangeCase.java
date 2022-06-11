package java8.pwing.contents;

import java.util.Scanner;
public class ChangeCase {
	
	/** 
	 * String Methods :
	 * 
	 * The String type provides two methods to converting String between upper case 
	 * 				and lower case
	 * 
	 * 1. toUpperCase() : to convert all characters to upper case
	 * 2. toLowerCase() : to convert all characters to lower case
	 * 
	 * this method gives converted String as a new Strings instances: the original
	 * String object is not modified because string is immutable in java.
	 *
	 * **/
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any day of the week : ");
		String day = sc.next();
			
		String upper = day.toUpperCase();
		String lower = day.toLowerCase();
			
		System.out.println("\n\n"+day);
		System.out.println(upper);
		System.out.println(lower+"\n\n");
			
		Day s1 = new Day();
		s1.Switch_case(lower);
		
		sc. close();
	}
		
}


