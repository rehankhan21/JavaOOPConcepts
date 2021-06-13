package firstpackage;
import java.util.Scanner;

public class FindLargestNum {

	public static void main(String[] args) {
		int a, b, c;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first num: ");
		a = scan.nextInt();
		System.out.println("Enter second num: ");
		b = scan.nextInt();
		System.out.println("Enter third num: ");
		c = scan.nextInt();
		
		
		int large = 0;
		
		if(a > b && a > c) {
			large = a;
		}
		else if (b > a && b > c) {
			large = b;
		}
		else
			large = c;
		
//		switch(large) {
//		case: a > b && a > c 
//		}
//		
		
		System.out.println("largest is " + large);
		
		System.out.println();
		
		scan.close();
	}

}
