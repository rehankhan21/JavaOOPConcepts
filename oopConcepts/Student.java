package oopConcepts;

public class Student extends Person1 implements PersonInterface {
		
	int student_id;
	float subject1, subject2, subject3;
	String student_major;
	double totalscore;
	
	public Student(int id, String name, int age, char gender, String major, float subject1,
			float subject2, float subject3) {
		
		//super(name, age, gender);
		super.setPage(age);
		super.setPgender(gender);
		super.setPname(name);
		this.student_id = id;
		this.student_major = major;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	
	public void calculate() {
		this.totalscore = this.subject1 + this.subject2 + this.subject3;
	}
	
	public double calculate(int totalSubjects) {
		this.totalscore = (this.subject1 + this.subject2 + this.subject3) / totalSubjects;
		return this.totalscore;
	}
	
	public void task(String class1, String class2) {
		String[] classes = {class1, class2};
		for(int i = 1; i <= 2; i++) {
			
			System.out.println("class " + i + " : " + classes[i - 1]);
		}
	}
	
	public void display() {
		System.out.println("--");
		System.out.println(ORGINIZATION);
		System.out.println("-------------");
		System.out.println("ID: "+this.student_id);
		//Person
		super.display();
		System.out.println("Major "+this.student_major);
		//System.out.println("Total Score: "+this.totalscore);
		
	}
}
