public class chrcount {
    public static void main(String[] args) {
        String str = "Hello World!";
        char ch[] = str.toCharArray();
        String s = "";
        for(int i=0;i<ch.length;i++){
            while(i<ch.length && ch[i]!=' '){
                s= s+ch[i];
                i++;
            }
            if(s.length()>0){
                System.out.println(s+" s=>"+s.length());
            }
        }
    }
}
