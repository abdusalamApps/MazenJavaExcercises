import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mata in 11 tal: ");
        int first = scanner.nextInt();
        int bigSum = 0;
        int smallSum = 0;
        for (int i = 0; i < 10; i++) {
            int next = scanner.nextInt();
            if (next > first) {
                bigSum = next + bigSum;
            }
            if (next < first) {
                smallSum = next + smallSum;
            }
        }
        System.out.println("bigSum = " + bigSum);
        System.out.println("smallSum = " + smallSum);
    }
}
