import java.util.Scanner;

public class repweatElement {

static int repeating(int arr[]){
    int n = arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                return arr[i];
            }
        }
    }
    return -1;
}




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
System.out.println("repeating element in array is");
System.out.println(repeating(arr));

    }
}
