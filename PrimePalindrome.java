import java.util.*;

class PalindromeThread extends Thread {
    private int num;

    public PalindromeThread(int num) {
        this.num = num;
    }

    public void run() {
        int temp = num, rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (num == rev)
            System.out.println(num + " is a Palindrome number.");
        else
            System.out.println(num + " is not a Palindrome number.");
    }
}

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println(n + " is a Prime number.");
        else
            System.out.println(n + " is a Composite number.");

        PalindromeThread pt = new PalindromeThread(n);
        pt.start();
    }
}
