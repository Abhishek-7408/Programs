public class WordCount {
    public static void main(String[] args) {
        String str = "Welcome to java proramming";
        int count = 0;
        if(str.charAt(0)!=' '){
            count++;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
