import java.util.*;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String res = "";
        boolean cap = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                res += " ";
                cap = true;
            } else if (cap) {
                res += Character.toUpperCase(ch);
                cap = false;
            } else {
                res += ch;
            }
        }

        System.out.println(res);
    }
}
