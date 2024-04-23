import java.util.Scanner;

public class fibonaciiSum {
    
public static int FibSum(int n)
{
   if(n<0) return 0;
   else if(n==1) return 1;
   else return FibSum(n-1) + FibSum(n-2);
}

public static void main(String args[])
{
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int res = FibSum(n);
    System.out.println(res);


}
}


