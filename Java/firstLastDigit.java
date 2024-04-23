import java.util.Scanner;

public class firstLastDigit {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int LastDigit = n%10;
        int firstDigit=0;
        while(n!=0){
            firstDigit = n%10;
            n= n/10;
        }
        System.out.println(firstDigit+" "+LastDigit);
    

//         int n,firstDigit;
//                 Scanner sc = new Scanner(System.in);
// n = sc.nextInt();
// int LastDigit = n%10;

// while(n!=0){
//     firstDigit =n%10;
//     n = n/10;
// }
//     }
// System.out.println(firstDigit,LastDigit);
    }
}
