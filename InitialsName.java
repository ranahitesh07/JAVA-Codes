import java.util.*;

public class InitialsName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
		
        String name = sc.nextLine();
        String initials = "";
        boolean takeNext = true;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == ' ') {
                takeNext = true;
            } else if (takeNext) {
                initials += Character.toUpperCase(ch) + " ";
                takeNext = false;
            }
        }
        System.out.println("Initials: " + initials.trim());
    }
}
