package oopConcepts;

public class InterestRate extends Person {
	double paid = 0, prin = 0, time = 0;
	double interest;
	static int count = 0;
	
	public InterestRate(double paid, double principle, double time, String name, int age, char gender){
		super(name, age, gender);
		this.paid = paid;
		this.prin = principle;
		this.time = time;
	}
	
	public void calculateInterest() {
		
		this.interest = 100 * (this.paid / (this.prin * this.time));
	}
	public void calculateInterest(double paid, double prin, double time, double avg) {
		
		this.interest = (this.paid / (this.prin * this.time) /  avg);
	}
	
	public void display() {
		super.display();
		System.out.println("your interest is : " + this.interest);
	}
}
