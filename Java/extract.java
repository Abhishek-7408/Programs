public class extract {
    public static void main(String[] args) {
        int a[] = {1,23,4,2,5,6,7};

System.out.println("Even numbers");

        //extract aven no
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);

            }

            
        }

        //odd extract

System.out.println("Odd numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);

            }

            
        }


    }
}
