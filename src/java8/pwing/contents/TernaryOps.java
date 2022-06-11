package java8.pwing.contents;

/**
 * Ternary Operators/Conditional operators :
 * 
 * 		-? and : are the two ternary operators
 * 		-Syntax : 
 * 
 * 				<condition> ? expression1 : expression2;
 * 
 * 			if condition is true  ---> expression1 executed
 * 			if condition is false ---> expression2 executed
 * 		
 * 		-it is also known as single line if else statement
 * **/

public class TernaryOps {
	
	public static void main(String[]args)
	{
		int a = 75;
		int b = 39;
		int c = 40;
		
		int percentage = 40;
		
		System.out.println((a>percentage)?"You are Pass":"You are Fail");
		System.out.println((b>percentage)?"you are Pass":"You are Fail");
		System.out.println((c==percentage)?"you are pass":"you are Fail");
	}
}
