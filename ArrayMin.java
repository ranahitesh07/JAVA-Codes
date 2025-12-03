import java.util.*;
class MinSearchThread extends Thread {
    int[] arr;
    int start, end;
    static int globalMin = Integer.MAX_VALUE;
    static Object lock = new Object();

    MinSearchThread(int[] arr, int start, int end) {
        this.arr = arr; this.start = start; this.end = end;
    }
    public void run() {
        int localMin = Integer.MAX_VALUE;
        for (int i = start; i < end; i++)
            if (arr[i] < localMin)
                localMin = arr[i];
        synchronized(lock) {
            if (localMin < globalMin)
                globalMin = localMin;
        }
    }
}
public class ArrayMin {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        MinSearchThread[] threads = new MinSearchThread[m];
        int blockSize = n / m;
        int remainder = n % m;
        int curr = 0;

        for (int i = 0; i < m; i++) {
            int start = curr;
            int end = start + blockSize;
            if (i < remainder) end++;
            threads[i] = new MinSearchThread(arr, start, end);
            threads[i].start();
            curr = end;
        }
        for (int i = 0; i < m; i++)
            threads[i].join();

        System.out.println("Minimum element in the array: " + MinSearchThread.globalMin);
    }
}
