import java.util.Scanner;

public class checkLeapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y%400==0){
            System.out.println(y+" => Leap year");19
        }
        else if(y%100==0){
            System.out.println(y+" => Leap year");

        }
else if(y%4==0){
    System.out.println(y+" => Leap year");

}
else{
    System.out.println(y+" => Not Leap year");

}

    }
}
