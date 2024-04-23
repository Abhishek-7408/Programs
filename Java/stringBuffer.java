import java.util.Scanner;

public class stringBuffer {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
         

        StringBuffer sb = new StringBuffer(String.valueOf(n));
        StringBuffer  rev= sb.reverse();
        System.out.println(rev);
    }
}
