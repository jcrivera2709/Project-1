import java.util.Scanner;

//José Rivera
// A sweet program to show what what I have learned in COP 2006
public class first {
	
	 printHello();

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Hello World");
		//int num1;
		//Person john = new Person();
		//john.height = 72;
		//System.out.println();
		
		
		//Integer saves a number/integer with no fraction number to a stated variable.
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1+num2);
		
		//Double saves numbers with decimals/fractional numbers to a stated variable.
		double doub1 = 4.5;
		double doub2 = 7.8;
		double doub3 = doub1 + doub2;
		
		System.out.println(doub3);
		
		//String saves a series of characters to a stated variable.
		String str1 = "This prints";
		String str2 = " my string variables.";
		
		System.out.println(str1+str2);
		
		//Boolean is an expression that can type a distinguish between a true or false statement.
		if(doub3>10) {
			System.out.println("This is a nice looking number");
		}
		
		//final makes the variable immutable.  Casting allows me to make a number into another value.
		final int num3 = 5;
		int num4 = 2;
		double result = (double)num3/num4;
		System.out.println(result);
		
		//these are string methods
		String str3 = "Length shows the length of the String. ";
		
		System.out.println(str3 + str3.length());
		
		String str4 = "UpperCase changes the selected characters to upper case letters. Ans LowerCase does the opposite";
		
		System.out.println(str4.toUpperCase());
		
		
	}
	
	public static void printHello() {
		
		System.out.println("Hello World");
		
	}
	
	
	

}
