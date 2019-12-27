package String_API;

public class CountCharacters {

	
	public static void main(String[] args) {
		String input="Today is Monday";
		
		System.out.println("Length of String is + "+input.length());
		
		char[] charArray=input.toCharArray();
//if you want to remove space from  string then add replaceAll("\\s+", "") method to remove extra space
//char[] charArray=input.replaceAll("\\s+", "").toCharArray();
		
		int lenght=charArray.length;
		
		
		int i=0 ,j=0,counter=0;
		
		for(i=0;i<lenght;i++)
		{
			counter=0;
			
			for(j=0;j<lenght;j++)
				
			{
				if(j<i && charArray[i]==charArray[j])
				{
					break;
				}
				if(charArray[j]==charArray[i]){
					counter++;
				}
				if(j == lenght-1){
					System.out.println("Sting Array "+charArray[i]+" is Present "+counter+" times ");		
				}
			}//End of J loop
			
		}//End of I loop
		
		
		}
	}







