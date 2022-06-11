package java8.pwing.contents;

/**
 * 	Runtime data area :		the runtime data area divided into four major areas
 * 
 *  		Method Area					Stack Area				Heap Area					program counter			Native method 
 * 																								register				Stack
 * 
 * 		-it stores class level		-it stores reference 	-All objects and their		-it stores address of		-it stores all
 * 			metadata					variables			corresponding instance 			currently executing 	variables & methods
 * 			>blocks					-local variables		variables are stored in		instruction and next		which are copied 
 * 			>constructor			-Method calling 		heap area					instruction to be 			from native method 
 * 			>class name					chain				-it is generally largest		executed				area
 * 		-static variables									memory area					-each thread will have
 * 		-static methods										-instance methods			separate PC Register
 * 		-members of interfaces
 * 						
 * **/

public class MemoryAlloction {
	
	static int clg_Id = 201500;
	
	int std_Id;
	String name;
	
	public MemoryAlloction(){
	}
	
	public MemoryAlloction(int std_Id, String name){
		super();
		this.std_Id = std_Id;
		this.name = name;
	}
	
	public void method2(){
		System.out.println("inside method2 !!!");
		System.out.println(name);
	}
	
	public static void method1(){
		int s = 10;
		MemoryAlloction m1 = new MemoryAlloction(12,"Ram");
		m1.method2();
		
		System.out.println("\ns ----> "+s);
		
		System.out.println("\n"+m1.std_Id);
		System.out.println(m1.name);
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		MemoryAlloction m1 = new MemoryAlloction(13,"Sham");
		MemoryAlloction m2 = new MemoryAlloction(14,"Radhe");
		
		method1();
		
		int b = 11;
		System.out.println("\n"+m2.std_Id);
		System.out.println(m2.name);
		
		System.out.println("\n"+m1.std_Id);
		System.out.println(m1.name);
		
		System.out.println("\nb ----> "+b);
	}

}
