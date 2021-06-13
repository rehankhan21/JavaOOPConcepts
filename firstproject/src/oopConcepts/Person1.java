package oopConcepts;

public class Person1 {
	static int count = 0;
	private String pname;
	private int page;
	private char pgender;
	
	public Person1( ) {
		count++;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String name) {
		this.pname = name;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int age) {
		this.page = age;
	}
	
	public char getPgender() {
		return pgender;
	}
	
	public void setPgender(char gender) {
		this.pgender = gender;
	}
	
	public static void totalPerson() {
		System.out.println("total person objects: " + count);
	}
	
	public void display() {
		System.out.println("name: " + this.pname);
		System.out.println("age: " + this.page);
		System.out.println("gender: " + this.pgender);
	}
}
