package String_API;

public class ReverseString_getBytes {

	public static void main(String[] args) {
		String input="This is mahesh Wagh";
		System.out.println(input.length());
		
		// getBytes() method to convert string  
        // into bytes[]. 
		byte [] inputSring=input.getBytes();
		
		byte []result= new byte[inputSring.length];
		
		// Store result in reverse order into the 
        // result byte[] 
		for(int i=0;i<inputSring.length;i++)
			result[i]=inputSring[inputSring.length-i-1];
		System.out.println(new String(result));

	}

}
