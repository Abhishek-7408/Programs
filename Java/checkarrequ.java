import java.lang.reflect.Array;
import java.util.Arrays;

public class checkarrequ {
    public static void main(String[] args) {
        int arr1[]  = {10,55,2055,88};
        
        int arr2[]  = {10,55,20,88};
        boolean status = Arrays.equals(arr1, arr2);

        if(status==true)
        System.out.println("arrays are equals");
        else
        System.out.println("Arrays are not equals");





    }
}
