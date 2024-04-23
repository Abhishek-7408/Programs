import java.util.Scanner;

public class firstlastdigeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int lastDigit=n%10;
        int firstDigit=0;
        while(n!=0)
        {
            firstDigit = n%10;
            n=n/10;
        }

        System.out.println(firstDigit+"\n"+lastDigit);
    }
}
