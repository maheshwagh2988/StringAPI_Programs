package NumberPrograms;

public class Palindrome_Number {

	public static void main(String[] args) {
		//A Palindrome Number is a number that even when reversed is same as original number
		int inputNumber=171; //It is the number  to be checked for palindrome 
		
		int lastDigit,tempNumber,sum=0;
		
		tempNumber=inputNumber;
		
        // Code to reverse a number
		while (tempNumber>0) {
			System.out.println("intput numner is--> "+tempNumber);
			lastDigit=tempNumber%10; //getting remainder 171/1=171.1 is is remainder and last digit of remainder is 1
			System.out.println("Last Digit--> "+lastDigit); 
			System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10)); 
			sum=(sum*10)+lastDigit;  
			tempNumber=tempNumber/10;  // //temp Variable is divided by 10 and will remainder is 1 and then compare both values
		}
		// if given number equal to sum than number is palindrome otherwise not palindrome
				if(sum==inputNumber)    
					System.out.println(sum + "-- Number is palindrome ");    
				else    
					System.out.println(sum + "--- Number is not palindrome");    
		 
			}
}
