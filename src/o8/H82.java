package o8;

public class H82 {
    static int[] numbers = {2, 5, 14, 21, 7, 8, 0};

    public static void main(String[] args) {
        printNumbers();
        int nbr = 10;
        int k = 2;
        for (int i = numbers.length - 1; i > k; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[k] = nbr;
        printNumbers();
        System.out.println(biggerThanZero(numbers));
        removeAt(numbers, 2);
        printNumbers();
        System.out.println(biggerThanZero(numbers));

    }

    public static void printNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(
                    i == numbers.length - 1 ? numbers[i] : numbers[i] + ", "
            );
        }
        System.out.println();
    }

    // b
    public static void removeAt(int[] array, int k) {
        for (int i = k + 1; i < array.length; i++) {
            numbers[i - 1] = numbers[i];
        }
        numbers[array.length - 1] = 0;
    }

    // c
    public static boolean biggerThanZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                return false;
            }
        }
        return true;
    }
}
