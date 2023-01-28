package remote1;

public class MySubtraction extends MyAddition{
	
	void sub(int a, int b) {
		int s = a-b;
		System.out.println(s);
	}
	
	public int add(int a, int b) {
		int sum = a+b+23;
		return sum;
	}

	public static void main(String[] args) {
		MySubtraction ms1 = new MySubtraction();
		ms1.sub(100, 60);
		
		//(100+100) - 75
		//a-b
		int s1 = ms1.add(100, 100);
		ms1.sub(s1, 75);

	}
}
