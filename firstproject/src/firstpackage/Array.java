package firstpackage;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int num = 10;
		
		int[] num1 = new int[] {10, 20, 30};
		int[] num2 = new int[10];
		char ch[] = new char[5];
		String s;
		
		String myStrings[] = new String[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter numbers for arr: ");
		
		
		for(int i = 0; i < num2.length; i++) {
			
			num = scan.nextInt();
			num2[i] = num;
			//System.out.println(num2[i]);
		}
		
		for(int i = 0; i < num2.length; i++) {
			
			System.out.println(num2[i]);
		}
		
		scan.nextLine();
		System.out.println("enter words for arr: ");
		for(int i = 0; i < myStrings.length; i++) {
			
			myStrings[i] = scan.next();
		}
		
		for(int i = 0; i < myStrings.length; i++) {
			
			System.out.println(myStrings[i]);
		}
		
		System.out.println("enter characters for arr: ");
		for(int i = 0; i < ch.length; i++) {
			
			ch[i] = scan.next().charAt(0);
		}
		
		for(int i = 0; i < ch.length; i++) {
			
			System.out.println(ch[i]);
		}
		
		
		
		scan.close();

	}

}
