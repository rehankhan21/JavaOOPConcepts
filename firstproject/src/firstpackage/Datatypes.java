package firstpackage;

public class Datatypes {

	public static void main(String[] args) {
		int num = 0;
		char c = 'a';
		boolean b = true;
		double deci = 2.7;
		float f = 1.1f;
		String name = "Rehan";
		//int[] arr = new int[10];
		
		int[] arr = {10,20,30};
	
//		arr[0] = 20;
//		arr[1] = 30;
		
		//int[0] arr2 = arr.slice();
		
		num = num + 2;
		
		int num2 = num * num;
		
		System.out.println("The number is " + num);
		System.out.println("The second number is " + num2);
		System.out.println("The string is " + name);
		System.out.println("The double is " + deci);
		System.out.println("The float is " + f);
		System.out.println("The char is " + c);
		System.out.println("The boolean is " + b);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("array at index " + i + " is " + arr[i]);
		}

	}

}
