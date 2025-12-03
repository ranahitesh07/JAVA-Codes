import java.util.*;
class Sum{
    public static int sumnatural(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumnatural(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = sumnatural(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

