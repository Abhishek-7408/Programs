import java.util.Scanner;

public class evenMulti {
    public static void main(String[] args) {
        int n;
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
               int pro = 1;
               for(int i=2;i<=n;i++){
                if(i%2==0){
                    pro = pro*i;
                }
               }

               System.out.println(pro);



    }
}
