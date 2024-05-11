public class towwerOfHanoi {
    public static void towewrHanoi(int n,String src,String helper,String dest){
if(n==1){
    System.out.println("Disk"+n+src+helper+dest);
    return;
}
towewrHanoi(n-1, src,dest, helper);
System.out.println("Disk"+n+src+helper+dest);
towewrHanoi(n-1, src,helper, dest);






    }
    public static void main(String[] args) {
        int n=1;
        towewrHanoi(n, "S", "D","H");
    }
}
