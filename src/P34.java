import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        double squareSum = 0;
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            sum = sum + x;
            squareSum = squareSum + (x * x);
        }
        double m = sum / n;
        if (n <= 5) {
            System.out.println("För få fall för standardavvikelse");
        } else {
            // calculate s
            double term1 = squareSum - n * m * m;
            double s = Math.sqrt(term1 / (n - 1));
            System.out.println("Standardavvikelse = " + s);
        }
        System.out.println("Medelvardet = " + m);
    }
}
