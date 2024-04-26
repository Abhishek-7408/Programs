import java.util.*;
public class reversearr {

static int RevArr(int arr[]){
    int n = arr.length;
    int[] ans = new int[n];
    int j=0;
    for(int i=n-1;i>=0;i--){

ans[j++] = arr[i];
    }
    return ans;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int []ans =RevArr(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]+" ");
        }
    
    }
}
