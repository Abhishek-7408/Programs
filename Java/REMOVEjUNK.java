public class REMOVEjUNK {
    public static void main(String[] args) {
        String s="abhishek ksuheewaha ahskdjf !@$#$#$#%^^#&$&";
        s=s.replaceAll("[^a-zA-z0-9]", "");
        System.out.println(s);
    }
}
