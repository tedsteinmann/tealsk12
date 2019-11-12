package chapter_2;

public class ScopeExample {

	public static void main(String[] args) {
		computeSum();

	}
	
	public static void computeSum() {
		int x = 3;
		int y = 7;
		int sum = x + y;
		System.out.println("sum = " + sum);
	}

}

