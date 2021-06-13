package firstpackage;
import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int multi; 
		
		System.out.println("Enter number: ");
		num = scan.nextInt();
		
		for(int i = 0; i <= 10; i++ ) {
			
			multi = i * num;
			System.out.println(i + " x " + num + " = " + multi);
			
		}

	}

}
