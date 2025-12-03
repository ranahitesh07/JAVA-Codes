import java.util.*;
class SumThread extends Thread {
    int start, end;
    static int sum = 0;
    static Object lock = new Object();

    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run() {
        int localSum = 0;
        for (int i = start; i <= end; i++)
            localSum += i;
        synchronized(lock) {
            sum += localSum;
        }
    }
}
public class SumNaturalNumbers {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter number of threads (m): ");
        int m = sc.nextInt();
        SumThread[] threads = new SumThread[m];
        int numbersPerThread = n / m;
        int remainder = n % m;
        int current = 1;

        for (int i = 0; i < m; i++) {
            int start = current;
            int end = start + numbersPerThread - 1;
            if (i < remainder) end++;
            threads[i] = new SumThread(start, end);
            threads[i].start();
            current = end + 1;
        }

        for (int i = 0; i < m; i++)
            threads[i].join();

        System.out.println("Sum of first " + n + " natural numbers is " + SumThread.sum);
    }
}
