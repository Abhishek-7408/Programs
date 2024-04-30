import java.util.Scanner;

public class gcd {

    public static int Gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Gcd(a,b);
        System.out.println(res);


        
    }
}
