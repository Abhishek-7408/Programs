import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        StringBuilder sbl=new StringBuilder();
        sbl.append(n);
        StringBuilder rev=sbl.reverse();
        System.out.println(rev);
    }
}
