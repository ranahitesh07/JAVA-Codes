import java.util.*;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = str.length();

        System.out.println("Total number of characters: " + count);
    }
}
