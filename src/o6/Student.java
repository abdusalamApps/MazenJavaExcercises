package o6;

import java.util.Random;

public class Student {
    static int number;
    private int id;
    private int[] grades;

    public Student() {
        number++;
        id = number;
        this.grades = generateGrades();
    }

    public int getId() {
        return id;
    }

    private int[] generateGrades() {
        int[] grades = new int[20];
        Random random = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(6);
        }
        return grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void printGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.print(
                    i == grades.length - 1 ? grades[i] : grades[i] + ", "
            );
        }
        System.out.println();
    }

    public int getNumberOfPassed() {
        int numberOfPassed = 0;
        for (int j = 0; j < grades.length; j++) {
            if (grades[j] > 2) {
                numberOfPassed++;
            }
        }
        return numberOfPassed;
    }
}
