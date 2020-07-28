package o8;

public class H84 {
    public static void main(String[] args) {
        double low = 0.0;
        double high = 1.6;
        double middle = 0.0;
        while ((high - low) > 0.00005) {
            middle = (high + low) / 2;
            if (f(middle) >= 0) {
                low = middle;
            } else {
                high = middle;
            }
        }
        System.out.println(middle);
    }

    public static double f(double x) {
        return Math.exp(-x) - 1 + Math.cos(x);
    }
}
