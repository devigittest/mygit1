package tests;

public class Test2 {
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		Test2 test = new Test2();
		int c = test.add(10,20);
		System.out.println(c);

	}

}
