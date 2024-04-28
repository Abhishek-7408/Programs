import java.util.Scanner;

public class firstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lasDigit = n%10;
        int firstDigit = 0;
        while (n!=0) {

            firstDigit = n%10;
            n = n/10;

            
        }

        System.out.println("First gitgit\n"+firstDigit+"\n Last digit\n"+lasDigit);
    }
}
