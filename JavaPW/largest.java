import java. util.*;
public class largest {


static int largestE(int arr[]){
    int n= arr.length;


    int mx = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
        if(arr[i]>mx){
            mx=arr[i];
        }
    }
    return mx;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");

        int n = sc.nextInt();
        int arr[]  =  new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("largest ele:");

        System.out.println(largestE(arr));
    }
}
