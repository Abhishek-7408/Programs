import java.util.Scanner;

public class checkPrime {
public static boolean isPrime(int n){
    if(n<=1){
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(i%2==0){
            return false;
        }
    }
    
    
    
    
    return true;

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" Prime Number");
        }
        else{
            System.out.println(n+" Not Prime");
        }
    }
}
