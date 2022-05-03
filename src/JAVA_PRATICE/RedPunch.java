package JAVA_PRATICE;

import java.util.Random;

public class RedPunch {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextBoolean());
        System.out.println(random.nextFloat());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100));

    }
}
