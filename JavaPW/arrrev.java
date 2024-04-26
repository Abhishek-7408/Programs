public class arrrev {

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {55, 88, 99, 77, 55, 60, 22, 10, 78, 65};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class arrrev {

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {55, 88, 99, 77, 55, 60, 22, 10, 78, 65};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
