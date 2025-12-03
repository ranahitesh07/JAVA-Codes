import java.util.*;

public class StringToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upperStr = str.toUpperCase();

        System.out.println("Uppercase: " + upperStr);
    }
}
