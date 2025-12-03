import java.util.*;
class Matrix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows for the first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter columns for the first matrix: ");
        int cols1 = sc.nextInt();
        System.out.print("Enter rows for the second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter columns for the second matrix: ");
        int cols2 = sc.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] sumMatrix = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}