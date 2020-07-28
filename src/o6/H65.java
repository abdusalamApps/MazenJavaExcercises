package o6;

public class H65 {
    public static void main(String[] args) {
        int[] nbrs = new int[100];
        for (int i = 0; i < nbrs.length; i++) {
            nbrs[i] = i + 1;
        }
        int index = 0;
        while (index <= 99 && nbrs[index] != 0) {
            index = index + 1;
        }
        System.out.println(index);
    }
}
