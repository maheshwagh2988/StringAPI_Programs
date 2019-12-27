package String_API;

public class Count_number_of_words_Lenght {

	public static void main(String[] args) {
		 String s = "Sharma is a good player and he is so punctual";
		 System.out.println("Total no of Char in the given String is--> "+s.length());
		 String removeSpace[]=s.split(" ");
		 System.out.println("No of word in given String is:--> "+removeSpace.length);
		 

	}

}
