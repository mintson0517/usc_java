package HW;

import java.util.Scanner;

public class HW_005_if {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int maxScore = 0;
        int passNo = 0;
        
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter student ID" + i + ": ");
            String sid = scanner.next();
            
            System.out.print("Enter test score" + i + ": ");
            int score = scanner.nextInt();

            maxScore = Math.max(maxScore, score);
            
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Student ID: " + sid + ", Score: " + score + ", Grade: " + grade);

            if (score >= 60) {
                passNo++;
            }
        }
        
        System.out.println("Max: " + maxScore);
        System.out.println("PassCount: " + passNo);
        
        scanner.close();
    }
}
