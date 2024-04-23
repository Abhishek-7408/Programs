import java.util.Scanner;

public class evenMul {
    public static void main(String[] args) {
        int pro=1;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
            pro=pro*i;

        }
        System.out.println(pro);
    }
}
