public class printKeypadPhone {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};


    public static void printCom(String str,int idx,String comb){
  if(idx==str.length()){
    System.out.println(comb);
    return;
  }
    char currChar = str.charAt(idx);
    String mapping = keypad[currChar-'0'];

    for(int i=0;i<mapping.length();i++){
printCom(str, idx+1, comb+mapping.charAt(i));


    }


    }


    public static void main(String[] args) {
       String str = "4";
       printCom(str, 0, ""); 


    }
}


//O(4^n)