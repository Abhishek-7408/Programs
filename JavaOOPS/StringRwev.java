import java.util.Scanner;
public class StringRwev {
    public static void printRev(String s,int index){

if(index==0){
    System.out.print(s.charAt(index));
    return;
}
System.out.print(s.charAt(index));
printRev(s, index-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printRev(str,str.length()-1);




    }
}
