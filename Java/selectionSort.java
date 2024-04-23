import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int a[] = {55, 50, 88, 1, 2, 7, 6, 20};
        int l = a.length;
        for (int i = 0; i < l - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < l; j++) {
                if (a[min_index] > a[j]) {
                    min_index = j;
                }
            }

            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
