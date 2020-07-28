import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int big = 0;
        int nextBig = 0;

        for (int i = 0; i < 100; i++) {
            int t = scanner.nextInt();
            if (t > big) {
                nextBig = big;
                big = t;
            } else if (t > nextBig) {
                nextBig = t;
            }
            if (big < nextBig) {
                int temp = big;
                big = nextBig;
                nextBig = temp;
            }
            System.out.println("big = " + big);
            System.out.println("nextBig = " + nextBig);
            System.out.println("Skillnaden mellan storsta och nast storst = " +
                    (big - nextBig));

        }
    }
}
