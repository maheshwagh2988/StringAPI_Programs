package String_API;

public class ReverseString_StringBuilder {

	
	public static void main(String[] args) {
		String input="My Name is Mahesh";
		
		StringBuilder input1 =new StringBuilder();
		
		input1.append(input);
		
		input1=input1.reverse();
		
		System.out.println(input1);

	}

}
