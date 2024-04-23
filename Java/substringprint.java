import java.util.Scanner;

public class substringprint {

    public static void substr(char s[],int n){

        for(int len=1;len<=n;len++){

            for(int i=0;i<=n-len;i++){
                int j=i+len-1;
                for(int k=i;k<=j;k++){
                    System.out.print(s[k]);
                }
                System.out.println();
            }

        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        char s[];
        n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        s=input.toCharArray();
        substr(s, n);
    }
}
