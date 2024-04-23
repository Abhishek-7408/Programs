
public class linearSearch {
    public static void main(String[] args) {
        int a[] = {10,50,80,90,88,77};
        int t=80;
        boolean status = false;
        for(int i=0;i<a.length;i++){


if(a[i]==t){
    System.out.println("Element found at:"+i);
    status=true;
    break;
}
        }

        if(status==false){
            System.out.println("Element not found");
        }
    }
}
