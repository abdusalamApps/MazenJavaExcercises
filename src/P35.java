import java.util.Scanner;

public class P35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in tal: ");
        int prev = scanner.nextInt();
        int current = scanner.nextInt();
        int n = 0;
        while (scanner.hasNextInt()) {
            if (current == prev) {
                n++;
            }
            prev = current;
            current = scanner.nextInt();
            if (current <= 0) {
                break;
            }
        }
        System.out.println();
        System.out.println("Antal ganger: " + n);
    }
}
