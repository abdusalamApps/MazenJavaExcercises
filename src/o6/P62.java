package o6;

public class P62 {
    public static void main(String[] args) {
        Student[] students = new Student[460];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print(students[i].getId() + ": ");
            students[i].printGrades();
        }

        int[] passed = new int[12];
        for (int i = 0; i < students.length; i++) {
            int numberOfPassed = students[i].getNumberOfPassed();
            if (numberOfPassed >= 11) {
                passed[11]++;
            } else {
                passed[numberOfPassed]++;
            }
        }
        for (int i = 0; i < passed.length; i++) {
            System.out.print(
                    i == passed.length - 1 ? passed[i] : passed[i] + ", "
            );
        }
    }
}
