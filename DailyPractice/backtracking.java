public class backtracking {


public static void printPermut(String str,String permutat,int idx){
if(str.length()==0){
    System.out.println(permutat);
    return;
}
for(int i=0;i<str.length();i++){


    char currChar = str.charAt(i);
    String newStr = str.substring(0, i) + str.substring(i+1);
    printPermut(newStr ,permutat+currChar,idx+1);}


}


        public static void main(String[] args) {
            
        String str = "ABC";
printPermut(str, "", 0);
        }
}
//O(n*n!)