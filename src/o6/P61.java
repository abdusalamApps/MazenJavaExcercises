package o6;

import java.util.Random;

public class P61 {
    public static void main(String[] args) {
        double rolled = 0;
        double stayed = 0;
        int n = 100000;
        for (int i = 0; i < n; i++) {
            boolean[] box = new boolean[7];
            Random random = new Random();
            int index = random.nextInt(7);
//            System.out.println("old index = " + index);
            box[index] = true;
            /*for (int i = 0; i < box.length; i++) {
                System.out.print(box[i] + " ");
            }
            System.out.println();*/
            int fullRange = random.nextInt(101);
            box[index] = false;
            if (fullRange > 20) {
                if (index < box.length - 1 && index > 0) {
                    int newRange = random.nextInt(101);
                    if (newRange < 50) {
                        index = index - 1;
                    } else {
                        index = index + 1;
                    }
                } else if (index == box.length - 1) {
                    index = index - 1;
                } else if (index == 0) {
                    index = index + 1;
                }
                rolled++;
            } else {
                stayed++;
            }
            box[index] = true;
            /*System.out.println("new index = " + index);
            for (int i = 0; i < box.length; i++) {
                System.out.print(box[i] + " ");
            }*/

        }
        System.out.println("Probability of rolled = " + rolled/n);
        System.out.println("Probability of stayed = " + stayed/n);
    }
}
