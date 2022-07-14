package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		
		char[] ch1 = test.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
			
			char indexChar = ch1[i];
			
			if (i%2!=0) {
				
				indexChar = Character.toUpperCase(indexChar);
			}
		
		         System.out.print(indexChar);
			
		}
		
	}

}
