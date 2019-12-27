package String_API;

import java.util.Scanner;

public class ReverseString_Scanner_CMD {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String inputStr=sc.nextLine();
		
		//Print length of String
		int lenght=inputStr.length();
		System.out.println("String Lenght is:--> "+lenght);
		
		// Using temp variable and charAt function reverse string
		String reverse="";
		for(int i=lenght-1;i>=0;i--)
			reverse=reverse + inputStr.charAt(i);
		System.out.println("Reverse of entered string is:--> "+reverse);
		
		System.out.println("**********************\n");
		
		//Another method to  reverse String with using tem Variable
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String input1 = sc1.nextLine();
		for(int i = input1.length()-1 ; i>=0; i--){
		System.out.print(input1.charAt(i));
		}
		
	

	}

}
