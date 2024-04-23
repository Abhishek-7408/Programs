import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

/*
 * 
 * 
 * a=a+b;
 * b=a-b;
 * a=a-b;
 * 
 * 
 * 
 * //
 * non zero
 * a=a*b;
 * b=a/b;
 * a=a/b;
 * 
 * 
 * //bitwise exor oprt
 * a=a^b;
 * b=a^b;
 * a=a^b;
 * 
 * 
 * b=a+b-(a=b);
 */

        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("before swapping values are :"+a+" "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping values are :"+a+" "+b );
    }
    
}
