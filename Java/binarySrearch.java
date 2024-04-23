public class binarySrearch {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        int mid;
        int l=0;
        int h=a.length-1;
        int key=7;
        boolean status = false;

        while(l<=h){

mid=(l+h)/2;

if(a[mid]==key){
    System.out.println("Element found");
    status = true;
    break;
}

if(a[mid]<key){
    l=mid+1;
}
if(a[mid]>key){

    h= mid-1;
}
        }

        if(status==false){
            System.out.println("Element Not found");
        }

    }
}
