import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int rev=0;
        int ori_num=n;
        while(n!=0){
            int rem=n%10;
            rev= rev*10+rem;
            n/=10;

        }

        if(ori_num==rev)
            System.out.println("Palindrome ");
        else
        System.out.println("Not palindrome");

    }
}
