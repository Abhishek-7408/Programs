public class evenlengthString {
    public static void main(String[] args) {
        String str = "Hell World Welcome to new world of learning";
        for(String s:str.split(" "))

{

    if(s.length()%2==0){
        System.out.println(s);
}
        }
    }
}
