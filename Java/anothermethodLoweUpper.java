import java.util.Scanner;

public class anothermethodLoweUpper {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char a[] = new char[size];
        for(int i=0;i<size;i++){
            a[i] = sc.next().charAt(0);

        }

        for(char c:a){
if(c>='A' && c<='Z')
c = (char)(c+32);

else if(c>='a' && c<='z')

c= (char)(c-32);
System.out.print(c+" ");




        }
    }
}
