package firstpackage;

public class fizzbuzz {

	public static void main(String[] args) {
		
		int counter = 100;
		
		for(int i = 1; i < counter; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz " + i);
			}
			else if(i % 3 == 0) {
				System.out.println("fizz " + i);
			}
			else if(i % 5 == 0) {
				System.out.println("buzz " + i);
			}
		}

	}

}
