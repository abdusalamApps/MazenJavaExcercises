package o6;

import java.util.Random;

public class H62 {
    public static void main(String[] args) {
        Random random = new Random();
        int first = random.nextInt(100) + 1;
        int second = random.nextInt(100) + 1;
        if (first > second) {
            System.out.println(second + ", " + first);
        } else {
            System.out.println(first + ", " + second);
        }
    }
}
