import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element you wanted to search:");
        int k = sc.nextInt();
        for(int i=0;i<n;i++){

            if(arr[i] ==k){

                System.out.println("Element found at index:"+i);
            }
           System.out.println();
        }

    }
}
