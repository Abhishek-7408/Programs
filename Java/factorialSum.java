import java.util.Scanner;

public class factorialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,sum=0;
        s=sc.nextInt();
        int fact=1;
        for(int i=1;i<=s;i++){
            fact = fact*i;
        }

        int result = fact;
        System.out.println(result);

        while(fact!=0){

            int rem = fact%10;
            sum= sum+rem;
            fact/=10;
            
} 
System.out.println(sum);

        

    


        



    }
}
