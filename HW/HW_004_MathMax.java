package HW;

import java.util.Scanner;

public class HW_004_MathMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second value: ");
        double number2 = scanner.nextDouble();

        double random = Math.random() * 100;//0〜99.999.....

        double average = (number1 + number2 + random) / 3;

        //Comparison of large and small
        double maximum = Math.max(Math.max(number1, number2), random);//Math.max(a,b);
        double minimum = Math.min(Math.min(number1, number2), random);//Math.max(a,b);

        System.out.println("First Value: " + number1);
        System.out.println("Second Value: " + number2);
        System.out.println("Random Value: " + random);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        scanner.close();
    }
}