package java8;

interface Calculator {
	int add(int a, int b);
}

public class CalculatorImpl {

	public static void main(String[] args) {
		Calculator calculator = (a, b) -> a + b;

		System.out.println(calculator.add(1, 2));
	}

}
