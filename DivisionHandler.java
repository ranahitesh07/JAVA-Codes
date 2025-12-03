import java.util.*;
public class DivisionHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, result;
        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();
        
        while (true) {
            System.out.print("Enter the second number: ");
            n2 = sc.nextInt();
            try {
                result = n1 / n2;
                System.out.println("Result: " + result);
                break;
            } catch (ArithmeticException ob) {
                System.out.println("Error: Division by zero is not allowed. Please enter a non-zero value.");
            }
        }
    }
}

	