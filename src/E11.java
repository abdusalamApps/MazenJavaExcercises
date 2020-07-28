import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int factor = 2;
        for (int k = 1; k <= 9; k++) {
            int digit = scanner.nextInt();
            int prod = factor * digit;
            if (prod > 9) {
                prod -= 9;
            }
            sum += prod;
            if (sum > 10) {
                sum -= 10;
            }
            factor = 3 - factor;
        }
        int cDigit = 10 - sum;
        System.out.println(cDigit);
    }
}
