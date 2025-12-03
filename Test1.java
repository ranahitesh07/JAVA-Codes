import org.shapes.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape to calculate area & perimeter:");
        System.out.println("1. Square\n2. Triangle\n3. Circle");
        int choice = sc.nextInt();
        System.out.println("--------------------");
        switch (choice) {
            case 1:
                System.out.print("Enter side length: ");
                double side = sc.nextDouble();
                Square square = new Square(side);
                System.out.println("Area: " + square.area());
                System.out.println("Perimeter: " + square.perimeter());
                break;

            case 2:
                System.out.print("Enter side 1: ");
                double s1 = sc.nextDouble();
                System.out.print("Enter side 2: ");
                double s2 = sc.nextDouble();
                System.out.print("Enter side 3: ");
                double s3 = sc.nextDouble();
                Triangle tri = new Triangle(s1, s2, s3);
                System.out.println("Area: " + tri.area());
                System.out.println("Perimeter: " + tri.perimeter());
                break;

            case 3:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                Circle circle = new Circle(r);
                System.out.println("Area: " + circle.area());
                System.out.println("Perimeter: " + circle.perimeter());
                break;

            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
