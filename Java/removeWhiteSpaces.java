public class removeWhiteSpaces {
    public static void main(String[] args) {
        String str="abhishek kushwaha cse 3rd year and doing programming all";
        str=str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
