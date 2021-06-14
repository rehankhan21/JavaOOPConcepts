package oopConcepts;

public class Cat extends Animal{
	private String color;
	private char gender;
	AnimalNoise noise;
	
	public Cat(String name, String type, boolean car, String food, int legs, String color, char gender) {
		super(name, type, car, food, legs);
		this.color = color;
		this.gender = gender;
	}
	
	public void noise(String noi) {
		noise = new AnimalNoise();
		noise.noise = noi;
	}
	
	public void display() {
		super.display();
		System.out.println("Color: " + this.color);
		System.out.println("Gender: " + this.gender);
		System.out.println("Noise: " + this.noise.noise);
	}
	
	
}
