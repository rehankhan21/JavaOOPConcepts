package firstpackage;
import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence;
		String sentence2;
		String s3 = "okay";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a sentence: ");
		sentence = scan.nextLine();
		
		
		System.out.println("enter second sentence");
//		scan.nextLine();
		sentence2 = scan.nextLine();
		
		System.out.println("Sentence 1 " + sentence);
		
		System.out.println("Sentence 2 " + sentence2);
		
		System.out.println("CharAt " + sentence.charAt(1));
		
		System.out.println("Concat " + sentence.concat(sentence2));
		System.out.println("startwith " + s3.startsWith(s3));
		System.out.println("endswith " + s3.endsWith("y"));
		System.out.println("index of " + sentence.indexOf(1));
		System.out.println("length " + sentence2.length());
		System.out.println("uppercase " + sentence.toUpperCase());
		
		scan.close();

	}

}
