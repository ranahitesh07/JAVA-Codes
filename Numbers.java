import java.util.*;

class OddThread extends Thread {
    int m, n;

    OddThread(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public void run() {
        System.out.print("Odd numbers: ");
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        OddThread oddThread = new OddThread(m, n);
        oddThread.start();

        try {
            oddThread.join();
        } catch (InterruptedException e) {
            
        }

        System.out.print("Even numbers: ");
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
