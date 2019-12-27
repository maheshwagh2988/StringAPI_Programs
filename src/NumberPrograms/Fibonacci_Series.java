package NumberPrograms;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		//In Fibonacci series, next number is the sum of previous two numbers.
		
		 int previousNumber = 0; 
		 int nextNumber = 1;
		 int maxNumber = 10; 
		 
		 //System.out.println("How many numbers you want in Fibonacci:");
	     //Scanner scanner = new Scanner(System.in);
	     //maxNumber = scanner.nextInt();
		 
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

		 for(int i=1; i<=maxNumber; i++){
			 
			 System.out.print(previousNumber+" ");
			 
			 int Sum=previousNumber+nextNumber;
			 previousNumber=nextNumber;
			 nextNumber=Sum;
			 			 
		 }
		 
		 System.out.println("\n");
		 
		 System.out.println("*********Using While loop***********\n");

		 int maxNumber_while = 10, previousNumber_while = 0, nextNumber_while = 1;
	        System.out.print("Fibonacci Series of "+maxNumber_while+" numbers:");

		 int j=1;
	        while(j <= maxNumber_while)
	        {
	            System.out.print(previousNumber_while+" ");
	            int sum_While = previousNumber_while + nextNumber_while;
	            previousNumber_while = nextNumber_while;
	            nextNumber_while = sum_While;
	            j++;
	        }
	}

}
