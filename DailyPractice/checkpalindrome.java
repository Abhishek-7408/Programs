import java.util.Scanner;

public class checkpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int org_num = n;
        while(n!=0){
            int r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        System.out.println(rev);

        if(org_num==rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
