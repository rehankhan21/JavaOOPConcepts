package oopConcepts;

public class Employee extends Person implements PersonInterface {

	int emp_id;
	double emp_salary;
	static int count = 0;
	Address addr; // similar to making a reference variable of type Address;
	
	Employee(int id, String name, int age, char gender, double salary) {
		super(name, age, gender); // super class constructor takes the name age and gender and passes
		// the variables to the super class and uses its constructor.
		this.emp_id = id;
		this.emp_salary = salary;
		//count++;
		count = super.count;
	}
	
	// this is called method overriding since  Person has the same method 
	// with the same name and signature.
	public void display() {
		System.out.println("Organization: " + PersonInterface.ORGINIZATION);
		System.out.println("id : " + this.emp_id);
		super.display(); // this is how we use parent methods.
		System.out.println("salary: " + this.emp_salary);
		System.out.println("City: " + addr.city);
		System.out.println("State: " + addr.state);
		System.out.println("Zipcode: " + addr.zipcode);
		System.out.println("Street: " + addr.street);
		
	}
	
	public void createAddr(String city, String state, String street, int zipcode){
		addr = new Address();
		addr.city = city;
		addr.state = state;
		addr.zipcode = zipcode;
		addr.street = street;
	}
	
	public static void totalPerson() {
		//count = super.count;
		System.out.println("number of emp " + count);
		System.out.println("-------");
	}
	
	public void task(String task1, String task2) {
		String[] tasks = {task1, task2};
		for(int i = 1; i <= 2; i++) {
			
			System.out.println("task " + i + " : " + tasks[i - 1]);
		}
	}
	
//	public void totalEmployee() {
//		super.totalPerson();;
//	}
	
	public double calculate(int bonus) {
		double netSalary = bonus + this.emp_salary;
		return netSalary;
	}

}
