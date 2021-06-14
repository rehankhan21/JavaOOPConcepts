package oopConcepts;

public class Animal {
	//private int legs;
	private String name;
	private boolean carnovore;
	private String eats;
	private int noOfLegs;
	private String type;
	
	public Animal (String name, String ty, boolean car, String food, int legs){
		this.name = name;
		this.carnovore = car;
		this.eats = food;
		this.noOfLegs = legs;
		this.type = ty;
	}
	
	public void display() {
		System.out.println("----------------");
		System.out.println("Animals");
		System.out.println("----------------");
		System.out.println("This animal is a: " + this.name);
		System.out.println("This animal is a: " + this.type);
		System.out.println("is a carnovore: " + this.carnovore);
		System.out.println("Eats: " + this.eats);
		System.out.println("noOfLegs: " + this.noOfLegs);
	}
}
