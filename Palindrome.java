package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		// Declare A String value as"madam"
		
		String str = "madam";
		
		//Declare another String rev value as ""
		
		String revstr = "";
		
		//Convert the string into Character array
		
		char[] charArray = str.toCharArray();
		
		//Iterate over the String in reverse order
		
		for (int i = charArray.length-1; i >=0; i--) {
			
			revstr =revstr+charArray[i];
			
		}
		
		//Print the reverse string
		
		System.out.println("The reverse string is "+revstr);
		
		//Compare the string and reverse string
		
		if (str.equalsIgnoreCase(revstr)) {
			
			 System.out.println("It is a Palindrome");
			
		} else {

			System.out.println("It is not a Palindrome");
		}
		

	}

}
