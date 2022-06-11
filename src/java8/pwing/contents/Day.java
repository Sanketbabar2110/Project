package java8.pwing.contents;

public class Day {
	
	void Switch_case(String day)
	{
		/**
		 * 
		 * In switch case we can pass following arguments only
		 * 
		 * 				byte		Byte
		 * 				short		Short
		 * 				int			Integer
		 * 				char		Characterm
		 * 
		 * 					and String, Enum 
		 * **/
		switch(day)
		{
			case "monday" :		System.out.println("Today is Monday");
								break;
						
			case "tuesday" :	System.out.println("Today is Tuesday");
								break;
			
			case "wendsday" :	System.out.println("Today is Wensday");
								break;
			
			case "thursday" :	System.out.println("Today is Thursday");
								break;
			
			case "friday" :		System.out.println("Today is Friday");
								break;
			
			case "saturday" :	System.out.println("Today is Saturday");
								break;
			
			case "sunday" :		System.out.println("Today is Sunday");
								break;
			
			default :			System.out.println("Invalid choice");
		}
	}
	
	public static void main(String[] args) {
		
	}
}
		

