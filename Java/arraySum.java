import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<size;i++){
            sum= sum+a[i];
        }

        System.out.println(sum);
    }
}
