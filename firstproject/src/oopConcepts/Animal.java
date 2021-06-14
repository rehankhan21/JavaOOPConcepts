package oopConcepts;

public class Animal {
	//private int legs;
	private boolean carnovore;
	private String eats;
	private int noOfLegs;
	private String type;
	
	public Animal (String ty, boolean car, String food, int legs){
		this.carnovore = car;
		this.eats = food;
		this.noOfLegs = legs;
		this.type = ty;
	}
	
	public void display() {
		System.out.println("This animal is a: " + this.type);
		System.out.println("is a carnovore: " + this.carnovore);
		System.out.println("Eats: " + this.eats);
		System.out.println("noOfLegs: " + this.noOfLegs);
	}
}
