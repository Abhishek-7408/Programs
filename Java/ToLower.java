import java.util.Scanner;

public class ToLower {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int s = sc.nextInt();
        
        char a[] = new char[s];
        for(int i=0;i<s;i++){
            a[i] = sc.next().charAt(0);
        }

// convert upper
/*
 * a=97
 * A=65
 * 0=48
 */

        for(char c:a){
            if(Character.isLowerCase(c)){
                c=(char)(c-32);
            }
            System.out.println(c);

           
            

        }

        for(char c:a){
            if(Character.isUpperCase(c)){
                c=(char)(c+32);
            }
            System.out.println(c);

           
            

        }

        
    
    }
}
