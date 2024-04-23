import java.util.Scanner;

public class countEvenOddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int even_count=0;
        int odd_count=0;
        while(n>0){
            int rem= n%10;
            if(rem%2==0)
            even_count++;
            else
            odd_count++;

            n=n/10;



        }
        System.out.println("Even Count:"+even_count+"\n"+"Odd count:"+odd_count);

    }
}
