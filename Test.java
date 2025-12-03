import btech.arithmetic.MyMath;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath math = new MyMath();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
		System.out.println("---------------------");
        System.out.println("Addition: " + math.add(a, b));
        System.out.println("Subtraction: " + math.subtract(a, b));
        System.out.println("Multiplication: " + math.multiply(a, b));

        if (b == 0) {
            System.out.println("Division: Not possible");
            System.out.println("Modulus: Not possible");
        } else {
            System.out.println("Division: " + math.divide(a, b));
            System.out.println("Modulus: " + math.mod(a, b));
        }
        sc.close();
    }
}
