package o6;

import java.util.Scanner;

public class H66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nbrs = new int[10];
        for (int i = 0; i < nbrs.length; i++) {
            nbrs[i] = scanner.nextInt();
        }
        for (int i = nbrs.length - 1; i >= 0; i--) {
            System.out.print(nbrs[i] + " ");
        }
    }
}
