import java.util.*;
class OddThread extends Thread {
    int[] a, b, result;
    OddThread(int[] a, int[] b, int[] result) {
        this.a = a; this.b = b; this.result = result;
    }
    public void run() {
        for(int i = 1; i < a.length; i += 2)
            result[i] = a[i] * b[i];
    }
}
class EvenThread extends Thread {
    int[] a, b, result;
    EvenThread(int[] a, int[] b, int[] result) {
        this.a = a; this.b = b; this.result = result;
    }
    public void run() {
        for(int i = 0; i < a.length; i += 2)
            result[i] = a[i] * b[i];
    }
}
public class ArrayProduct {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n], b = new int[n], result = new int[n];

        System.out.println("Enter first array: ");
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println("Enter second array: ");
        for(int i = 0; i < n; i++) b[i] = sc.nextInt();

        OddThread odd = new OddThread(a, b, result);
        EvenThread even = new EvenThread(a, b, result);

        odd.start();
        even.start();
        odd.join();
        even.join();

        System.out.print("Product array: ");
        for(int i = 0; i < n; i++)
            System.out.print(result[i] + " ");
        System.out.println();
    }
}
