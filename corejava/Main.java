import java.util.*; 
public class Main { 
    static String compress(String s) { 
        if (s.length() == 0) { 
            return ""; 
        } 
        char ch = s.charAt(0); 
        int i = 1; 
        while (i < s.length() && s.charAt(i) == ch) { 
            i++; 
        } 
        String ros = s.substring(i); 
        ros = compress(ros); 
        String charCount = i + ""; 
        return ch + charCount + ros; 
    } 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next(); 
        System.out.println(compress(s)); 
    } 
} 