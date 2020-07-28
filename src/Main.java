import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sayHi = true;
        int n = 10;

       /* System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(
                    i == numbers.length - 1 ? String.valueOf(numbers[i]) : numbers[i] + ", "
            );
        }
        System.out.print("] \n");
*/
        int[] numbers = {2, 3, 56, 765, 456, 12}; // length 6
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // == sum = sum + numbers[i];
        }
        System.out.println("The sum is " + sum);
        // c^2 = b^2 + a^2
        int a = 20;
        int b = 32;
        System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));


        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int mul = 1;
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            mul *= number;
            System.out.println(mul);
        }


       /* StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            if (i%2 == 0) {
                builder.append(i + ", ");
            }
        }
        System.out.println(builder.toString());

        BookLibrary library = new BookLibrary();
        library.addBook(new Book());*/

    }
}
