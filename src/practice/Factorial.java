package practice;

public class Factorial {

	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}
	
	public static int factorial(int num) {
		if (num <= 1) return num;
		else {
			return factorial(num - 1) * num;
		}
	}
}
