package o8;

import java.util.Random;

public class H83 {
    static char[] letters = new char[26];

    public static void main(String[] args) {
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('A' + i);
        }
        printArray();

        Random random = new Random();
        while (letters.length > 0) {
            int randomIndex = random.nextInt(letters.length);
            System.out.println(letters[randomIndex] + ", ");
            // Remove the element at randomIndex
            removeAt(letters, randomIndex);
            letters = makeSmaller(letters);
            printArray();
        }
        System.out.println();
        System.out.println(letters.length);
        printArray();
    }

    public static void removeAt(char[] array, int k) {
        for (int i = k + 1; i < array.length; i++) {
            letters[i - 1] = letters[i];
        }
    }

    public static char[] makeSmaller(char[] array) {
        char[] temp = new char[array.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[i];
        }
        return temp;
    }

    public static void printArray() {
        for (int i = 0; i < letters.length; i++) {
            System.out.print(
                    i == letters.length - 1 ? letters[i] : letters[i] + ", "
            );
        }
        System.out.println();
    }

}
