public class printSubsequence {
    public static void subseq(String str,int idx,String newStr)
{

    if(idx==str.length())
{

System.out.println(newStr);
return;


}char currChar= str.charAt(idx);
//to be
subseq(str, idx+1, newStr+currChar);



// or not to be

subseq(str, idx+1, newStr);

}
    public static void main(String[] args) {
        
String str = "abc";
subseq(str, 0, "");

    }
}

// O(2^n)