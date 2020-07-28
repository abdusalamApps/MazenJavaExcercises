import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Mata in en foljd av positiva heltal: ");
        while (scanner.hasNextInt()) {
            int next = scanner.nextInt();
            if (next == 0) {
                break;
            } else {
                n++;
            }
        }
        System.out.println();
        System.out.println("Antal tal i talfoljden: " + n);
    }
}
