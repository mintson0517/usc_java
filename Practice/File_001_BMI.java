package Practice;

import java.util.Scanner;

public class File_001_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your sid: ");
        String sid = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height(CM): ");
        int height = scanner.nextInt();

        System.out.print("Enter your weight(KG): ");
        int weight = scanner.nextInt();

        double heightM = height / 100.0;
        double bmi = weight / (heightM * heightM);

        System.out.printf("sid:%s, age:%dyears old, height:%dcm, weight:%dkg, BMI:%.1f\n", sid, age, height, weight,bmi);

        scanner.close();
    }
}
