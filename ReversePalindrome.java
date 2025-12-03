import java.util.*;

public class ReversePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Reversed string: " + reversed);

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
