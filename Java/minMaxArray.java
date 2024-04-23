public class minMaxArray {
    public static void main(String[] args) {
        int a[] = {111,22,55,66,88,99,100,105};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }

        }

        System.out.println("maximum element in arrays is:"+max);

int min = a[0];

for(int i=1;i<a.length;i++){
if(a[i]<min){
    min = a[i];

}

}

System.out.println("Minimum element in array:"+min);




    }
}
