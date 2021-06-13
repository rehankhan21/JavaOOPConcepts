package firstpackage;

public class ExecptionHandling {

	public static void main(String[] args) {
		
		int test;
		int[] arr = {1,2,3};
		String s = "he";
		String numS = "2";
		int num2 = 2;
		Object num3 = null;
		
		try {
			int data=100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("rest of code");
		
		try {
			//int[] arr = {1,2, 3};
			System.out.println(arr[2]);
			int num = arr[1]/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		// try catch with a for loop
		for(int i = 0; i < 10; i++) {
			try {
				test = arr[i];
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
		
		try {
			s.charAt(9);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
//		try {
////			if(num3 == num2) {
////				System.out.println("true");
//			}
//		}
//		catch(NumberFormatException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		}

	}

}
