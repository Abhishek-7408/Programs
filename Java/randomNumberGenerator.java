import java.util.Random;

public class randomNumberGenerator {
    public static void main(String[] args) {
        Random rnd = new Random();
       int random_num= rnd.nextInt(9);
       System.out.println(random_num);

double dbl = rnd.nextDouble();
System.out.println(dbl);


System.out.println(Math.random());

    }
}
