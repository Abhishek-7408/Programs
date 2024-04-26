import java.util.Scanner;

public class swap {


static void swap(int a,int b){
   System.out.println("original value before swap:");
   System.out.println("a :"+a);
   System.out.println("b :"+b); 


   //after swap
//    int temp = a;
//    a=b;
//    b=temp;


a=a+b;
b=a-b;
a=a-b;



   System.out.println("original value before after swap:");
   System.out.println("a :"+a);
   System.out.println("b :"+b); 


}



        public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
swap(a,b);
        }
}
