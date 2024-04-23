import java.util.Scanner;

public class printTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pro=1;
        for(int i=1;i<=10;i++)
        {
            pro=n*i;
            System.out.println(pro);
        }
        System.out.println("");
    

    }
}
