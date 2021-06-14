package oopConcepts;

// Java Bean Class
public class Person {
	//Encapsulation
	static int count = 0;
	String pname;
	int page;
	char pgender;
	
	
	public Person() {
		count++;
	}
	
	public Person(String name, int age, char gender) {
		
		pname=name;
		page=age;
		pgender=gender;
		count++;
	}
	
	public void display() {
		
		System.out.println("Name " + this.pname );
		System.out.println("Gender " + this.pgender);
		System.out.println("Age " + this.page);
		System.out.println(count);
	}
	
	public static void totalPerson()
	{
		System.out.println("total people objects " + count);
	}
	
}

