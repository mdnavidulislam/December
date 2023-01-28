package remote1;

public class MyAddition {
	
	//OOP ---
	//1. Inheritance -- parent/ child class relationship
	//2. Polymorphism -- 
	//a. method over loading -- same method name many times
	//b. method overriding -- same method in a parent class and child class
	//3. Encapsulation -- (capsul) -- protecting the variable and methods
	//4. Abstraction
	
	private int x; 
	private int y;
	
	//return type -- method name (parameters){ }
	void add() {
		int sum = x+y;
		System.out.println(sum);
	}

	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	protected double add(double a, double b) {
		double sum = a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		MyAddition ma1 = new MyAddition();
		ma1.x = 20;
		ma1.y = 35;
		ma1.add();
		
		int s1 = ma1.add(200,200);
		System.out.println(s1);

	}

}
