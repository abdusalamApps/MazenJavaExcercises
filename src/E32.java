import java.util.Scanner;

public class E32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            boolean prime = true;
            for (int k = 3; k <= Math.sqrt(n); k += 2) {
                if (n % k == 0) {
                    System.out.println("Divisible by " + k);
                    prime = false;
                    break;
                }
            }
            System.out.print(n + " is ");
            System.out.println(prime ? "prime" : "not prime");

        }
    }
}
