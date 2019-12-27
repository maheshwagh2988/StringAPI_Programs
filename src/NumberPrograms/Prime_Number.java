package NumberPrograms;

public class Prime_Number {

	public static void main(String[] args) {
		//A prime number is a number that is only divisible by 1 or itself.
		//For example, 11 is only divisible by 1 or itself. Other Prime numbers 2, 3, 5, 7, 11
		
		int remainder;
		boolean isPrime=true;
		int numberToCheck=17;
		
		for(int i=2;i<numberToCheck/2;i++){
	   //numberToCheckber is dived by itself
		remainder=numberToCheck%i;
		System.out.println(numberToCheck+" Divided by "+ i + " gives a remainder "+remainder);
		//If remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
			if(remainder==0){
				isPrime=false;
				break;
			}
		}
	
		if(isPrime)
			System.out.println(numberToCheck + " is a Prime number");
		 else
		   System.out.println(numberToCheck + " is not a Prime number");
	}

}
