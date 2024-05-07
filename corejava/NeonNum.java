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
        return sum==n;

    }
    	public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            if(isNeon(n)){
                System.out.println("Neon Number");
            }
            else{
                System.out.println("Not Neon");
            }
            
        }
}
