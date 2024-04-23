import java.util.Scanner;

public class charUpperLowr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        char a[] = new char[size];

        for(int i=0;i<size;i++){
a[i] = sc.next().charAt(0);
        }

for(char c:a){
if(Character.isUpperCase(c))
c=Character.toLowerCase(c);
else if(Character.isLowerCase(c))
c=Character.toUpperCase(c);

System.out.print(c+" ");


}

    }
}
