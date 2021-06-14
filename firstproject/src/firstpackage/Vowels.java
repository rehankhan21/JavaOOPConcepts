package firstpackage;
import java.util.Scanner;


public class Vowels {

	public static void main(String[] args) {

		String s;
		int numOfVowels = 0;
		//char vowels[];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a word: ");
		s = scan.next();
		
		String sLower = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++) {
			
			char ch = sLower.charAt(i);
			
			if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
				numOfVowels++;
			}
			
		}
		
		System.out.println("There are " + numOfVowels + " vowels");

	}

}
