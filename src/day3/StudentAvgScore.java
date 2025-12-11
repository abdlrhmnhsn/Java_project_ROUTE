package day3;

import java.util.Scanner;

public class StudentAvgScore {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double total=0,avg=0;
        int numberOfStudents= 3,numbersOfTests=4;

        for (int i = 0; i <numberOfStudents; i++) {
            System.out.println("The student no " + (i + 1));
            for (int j = 0; j < numbersOfTests; j++) {
                System.out.println("The test no " + (j + 1));
                double score = scanner.nextDouble();
                total +=score;
            }
            avg = total/4;
            System.out.println("Avg score of student no. "+(i + 1)+"  is "+avg);
        }
        scanner.close();
    }
}