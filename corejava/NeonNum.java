import java.util.Scanner;

public class NeonNum {

    public static boolean isNeon(int n){
        int sqr = n*n;
        int sum =0;
        while(sqr>0){
            int r = sqr%10;
            sum = sum+r;
            sqr/=10;
        }
if(sum==n){
    return true;
    return false;


    }
    	public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            isNeon(n);
            
        }
}
