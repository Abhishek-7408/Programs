import java.util.Scanner;

public class evenMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pro = 1;
        for(int i=2;i<=n;i++){
            if(i%2==0){
                pro = pro*i;
            }
        }
        System.out.println(pro);
    }
}
