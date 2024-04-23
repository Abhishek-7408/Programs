import java.util.Scanner;

public class forStringUpperLower {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();


    for(int i=0;i<str.length();i++){
        char c= str.charAt(i);

if(c>='a' && c<='z')
c=(char)(c-32);
else if(c>='A' && c<='Z')
c=(char)(c+32);

System.out.print(c+" ");


    }
    
    }
}
