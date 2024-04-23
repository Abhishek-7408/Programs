import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        //logic
        if(a>b && a>c)
        System.out.println("A is greater:"+a);
        else if(b>a && b>c)
        System.out.println("b is largest:"+b);
        else
        System.out.println("c is largest:"+c);
    }
}
