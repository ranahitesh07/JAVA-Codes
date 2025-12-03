import java.util.Scanner;

interface Calculator {
	double add(double a, double b);
	double sub(double a, double b);
	double mul(double a, double b);
	double div(double a, double b);
}

class DemoCalculator implements Calculator {
	public double add(double a, double b) {
		return a + b;
	}
	public double sub(double a, double b) {
		return a - b;
	}
	public double mul(double a, double b) {
		return a * b;
	}
	public double div(double a, double b) {
		return a / b;
	}
}

public class CalculatorDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new DemoCalculator();
		
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();
		
		System.out.print("Enter second number: ");
		double b = sc.nextDouble();
		System.out.print("----------------------------\n");
		System.out.println("Addition: " + calc.add(a, b));
		System.out.println("Subtraction: " + calc.sub(a, b));
		System.out.println("Multiplication: " + calc.mul(a, b));
		System.out.println("Division: " + calc.div(a, b));
		
		sc.close();
	}
}
