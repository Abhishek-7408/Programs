public class specificCharocc {
    public static void main(String[] args) {
        String str = "abhishek kushwhaa and";
        int bc = str.length();
        int afc = str.replaceAll("a","").length();
        int count=bc-afc;
        System.out.println(count);
    }
}
