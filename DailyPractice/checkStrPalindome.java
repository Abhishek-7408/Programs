import java.util.Scanner;

public class checkStrPalindome {

    public static void revStr(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        revStr(str, index - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        revStr(str, str.length() - 1);

        System.out.println();

        String reverStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverStr += str.charAt(i);
        }

        if (str.equals(reverStr)) {
            System.out.println("String is palindrome");
        }

        else {
            System.out.println("Not Palindrome");

        }

    }
}
