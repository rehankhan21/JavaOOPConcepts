package oopConcepts;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id, age, bonus;
		float sub1, sub2, sub3, salary;
		char gender;
		String name, major, task1, task2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Employee name: ");
		name = scan.nextLine();
		
		System.out.println("Enter Employee id: ");
		id = scan.nextInt();
		
		System.out.println("Enter Employee age: ");
		age = scan.nextInt();
		
		System.out.println("Enter Employee Gender: ");
		gender = scan.next().charAt(0);
		
		System.out.println("Enter Employee Salary: ");
		salary = scan.nextFloat();
		
		System.out.println("Enter Employee Bonus: ");
		bonus = scan.nextInt();
		
		System.out.println("Enter Employee first task: ");
		scan.nextLine();
		task1 = scan.nextLine();
		
		System.out.println("Enter Employee second task: ");
		//scan.nextLine();
		task2 = scan.nextLine();
		
		Employee emp1 = new Employee(id, name, age, gender, salary);
		//Employee emp2 = new Employee(201, "Bob" , 21, 'f', 40000);
		
		emp1.display();
		//emp2.display();
		System.out.println("netSalary with bonus:  "+emp1.calculate(bonus));
		emp1.task(task1, task2);
		Employee.totalPerson();
		
		
		System.out.println("Enter student name: ");
		//scan.nextLine();
		name = scan.nextLine();
		
		System.out.println("Enter student id: ");
		id = scan.nextInt();
		
		System.out.println("Enter student age: ");
		age = scan.nextInt();
		
		System.out.println("Enter grade for subject 1: ");
		sub1 = scan.nextFloat();
		
		System.out.println("Enter grade for subject 2: ");
		sub2 = scan.nextFloat();
		
		System.out.println("Enter grade for subject 3: ");
		sub3 = scan.nextFloat();
		
		System.out.println("Enter Student Gender: ");
		gender = scan.next().charAt(0);
		
		System.out.println("Enter Student Major: ");
		scan.nextLine();
		major = scan.nextLine();
		
		System.out.println("Enter Employee first class: ");
		//scan.nextLine();
		task1 = scan.nextLine();
		
		System.out.println("Enter Employee second class: ");
		//scan.nextLine();
		task2 = scan.nextLine();
		
		//String.format("%.3f", avg);
		
		Student stu1 = new Student(id, name, age, gender, major, sub1, sub2, sub3);
		stu1.display();
		double avg = stu1.calculate(3);
		System.out.println("Total score: " + String.format("%.3f", avg));
		stu1.task(task1, task2);;
				
		
	
	}

}
