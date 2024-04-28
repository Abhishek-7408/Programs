import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int binary = sc.nextInt();
    int decimal = 0;
    int base = 1;


    while(binary!=0){
        int rem = binary%10;
        decimal+=rem*base;
        binary/=10;
        base = base*2;
    }
    System.out.println(decimal);
    }
}

