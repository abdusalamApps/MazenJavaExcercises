import java.util.Scanner;

public class Tuesday306 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt() * 3;
        }

        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(
                    i == numbers.length - 1 ? String.valueOf(numbers[i]) : numbers[i] + ", "
            );
        }
        System.out.print("] \n");
    }
}
