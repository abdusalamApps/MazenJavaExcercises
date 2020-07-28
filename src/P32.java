public class P32 {
    public static void main(String[] args) {
        int i = 1;
        int n = 0;
        int sum = 0;
        /*while (sum < 100000) {
            if (i % 2 != 0) {
                sum = sum + i;
                n++;
            }
            i++;
        }*/

        while (sum < 100000) {
            sum = sum + i;
            n++;
            i = i + 2;
        }
        System.out.println("n = " + n);
        System.out.println("sum = " + sum);

    }
}
