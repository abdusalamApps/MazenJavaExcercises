package o6;

public class P63 {
    static boolean[] used = new boolean[10];
    public static void main(String[] args) {
        int number = 8640876;
        int numberOfDigits = 0;
        while (number != 0) {
            int digit = number%10;
            if (!used[digit]) {
                numberOfDigits++;
                used[digit] = true;
            }
            number = number / 10;
            printUsed();
        }
        System.out.println(numberOfDigits);
    }

    public static void printUsed() {
        for (int i = 0; i < used.length; i++) {
            System.out.print(
                    i == used.length - 1 ? used[i] : used[i] + ", "
            );
        }
        System.out.println();
    }
}
