package firstpackage;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int num;
		String name;
		String str;
		//char c;
		long l;
		double d;
		
		// make a scanner object from scanner class
		// scan can read input from user
		Scanner scan = new Scanner(System.in);
		
		// integer input
		System.out.println("enter a number: ");
		num = scan.nextInt();
		// String input
		System.out.println("enter sentence: ");
		// if u want a sentence with spaces then nextLine
		// before scanning with next line u have to write an empty nextline
		// then u can store user input
		scan.nextLine();
		name = scan.nextLine();
		
		System.out.println("enter word: ");
		// this will only be a single word, no spaces, next
		str = scan.next();
		
		// there is no scanChar
//		System.out.println("enter your character: ");
//		char
		
		System.out.println("enter your decimal number: ");
		d = scan.nextDouble();
		
		System.out.println("enter long number: ");
		l = scan.nextLong();
		
		System.out.println("number is : " + num);
		System.out.println("your sentence is : " + name);
		System.out.println("your word is : " + str);
		System.out.println("your decimal is : " + d);
		System.out.println("your long num is : " + l);
		

		scan.close();
	}

}
