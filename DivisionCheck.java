import java.util.Scanner;

public class DivisionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, result;
        System.out.print("Enter value for x: ");
        x = sc.nextInt();
        System.out.print("Enter value for y: ");
        y = sc.nextInt();

        try {
            result = x / (x - y);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ob) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
