import java.util.*;
class GCDError {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two numbers.");
            return;
        }
        int a = 0, b = 0;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
}





