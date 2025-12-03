import java.util.*;

public class FeetConvert{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = 0, inches = 0;
        
        while (true) {
            try {
                System.out.print("Enter feet: ");
                feet = Double.parseDouble(sc.next());
                System.out.print("Enter inches: ");
                inches = Double.parseDouble(sc.next());
                if (feet < 0 || inches < 0) {
                    throw new IllegalArgumentException("Negative numbers are not allowed.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter numeric values only");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Try again.");
            }
        }
        double centimeters = (feet * 12 + inches) * 2.54;
        System.out.println("Length in centimeters: " + centimeters);
    }
}
