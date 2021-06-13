package firstpackage;
import java.util.Scanner;

public class GradesSwitch {

	public static void main(String[] args) {
		
		//String c;
		char ch;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter you grade pls: ");
		ch = scan.next().charAt(0);
		
		
		switch(ch) {
		case 'A':
			System.out.println("You are top of the class");
			break;
		case 'B':
			System.out.println("You are close to top of the class");
			break;
		default:
			System.out.println("you are getting closer, Ganbatte Kudasai!!!");
			break;
			
		}
		
		scan.close();
	}

}
