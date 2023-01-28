package remote2;

import remote1.MyAddition;

public class MyMultiplication extends MyAddition{
	
	void multiple(int a, int b) {
		int m = a*b;
		System.out.println(m);
	}
	
	//access modifiers
	//public -- accessible with the entire project
	//private -- accessible only within the class
	//protected -- accessible within package + outside package if inherited
	//default -- accessible within the package only
	

	public static void main(String[] args) {
		MyMultiplication mm1 = new MyMultiplication();
		mm1.multiple(100, 100);
		
		//(100+100) *20
		int s1 = mm1.add(100, 100);
		mm1.multiple(s1, 20);
		mm1.add(10.15, 20.55);
		

	}

}
