import java.util.Scanner;

public class DecimalToBinary {

    public static int decimaltobin(int n){
        int binary = 0;
        int base = 1;
        while(n!=0){

int rem = n%2;
binary = binary+base*rem;
base=base*2;
n=n/2;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = decimaltobin(n);
        System.out.println(ans);
    }
}
