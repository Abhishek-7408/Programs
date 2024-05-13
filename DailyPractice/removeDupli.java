import java.util.Scanner;

public class removeDupli {
    public static boolean[] map = new boolean[26];

    public static void remdup(String str,int index,String newStr){
if(index==str.length())
{
    System.out.println(newStr);
    return;
}


char currChar = str.charAt(index);
if(map[currChar-'a']==true){
    remdup(str, index+1, newStr);
}
else{
newStr+=currChar;
map[currChar-'a']=true;
remdup(str, index+1, newStr);



}


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        remdup(str, 0, "");
    }
}
