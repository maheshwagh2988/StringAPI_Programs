package NumberPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int inputArmstrongNumber=370;
		
		int tempNumber,digit,digitCubeSum=0;
		tempNumber=inputArmstrongNumber;
		
		while (tempNumber!=0) {
			System.out.println("Cuurrent tem number is -->"+tempNumber);
			digit=tempNumber%10;
			System.out.println("Current Digit is-->"+digit);
			//sum of cubes of each digits is equal to thetempNumber itself
			digitCubeSum=digitCubeSum+digit*digit*digit;
			System.out.println("Current digitCubeSum is "+digitCubeSum);
			tempNumber /= 10;
		}
        //check giventempNumber and digitCubeSum is equal to or not 
		if(digitCubeSum == inputArmstrongNumber)
		{
            System.out.println(inputArmstrongNumber + " is an Armstrong Number");

		}else
		{
            System.out.println(inputArmstrongNumber + " is not an Armstrong Number");

		}

	}

}
