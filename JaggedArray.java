import java.util.*;
public class JaggedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for jagged array: ");
        int rows = sc.nextInt();
        int[][] jaggedArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row: ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];
            System.out.println("Enter elements for row:");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying the jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
