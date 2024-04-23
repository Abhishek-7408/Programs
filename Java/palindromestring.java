import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        String rev="";
        String org_str=str;
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        System.out.println("Reverse of String is: "+rev);

        if(org_str.equals(str))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");

    }
}
