public class tryCatch {
    public static void main(String[] args) {
        int a[] = {55,88,66,44,20};
        try{
            System.out.println(a[10]);
        }
        catch(Exception e){
            ///

            System.out.println("arrays out of bound exception");
        }

        System.out.println("Try catch successfully works");
    }
}
