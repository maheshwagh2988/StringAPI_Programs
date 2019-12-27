package String_API;

public class Count_Occurrence_Single_Character {

	public static void main(String[] args) {
		String str="MAhesh WAgh";
		char ch='A';
		int count=0;
		for(int i=0;i<str.length()-1;i++){
			char ch1=str.charAt(i);
			if(ch==ch1){
				count++;
			}
		}
		System.out.println("Charecter " +ch+ " Occurce " +count+ " times in the given String");

	}

}
