package String_API;

public class ReverseString_toCharArray {

	
	public static void main(String[] args) {
		String input="My Name is Mahesh";
		
		char [] updateCharString =input.toCharArray();
		
		for(int i=updateCharString.length-1;i>=0;i--)
			
			System.out.println(updateCharString[i]);
	}

}
