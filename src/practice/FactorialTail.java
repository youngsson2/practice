package practice;

public class FactorialTail {

	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}
	
	public static int factorialTail(int num, int acc) {
		if (num <= 1) return acc;
		else {
			return factorialTail(num - 1, acc * num);
		}
	}
	
	public static int factorial(int num) {
		return factorialTail(num, 1);
	}
}
