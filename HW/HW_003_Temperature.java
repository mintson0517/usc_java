package HW;

import java.util.Scanner;

public class HW_003_Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your sid: ");
        String sid = scanner.next();

        System.out.print("Enter the date of month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the date of day: ");
        int day = scanner.nextInt();

        System.out.print("Enter your temperature F: ");
        double temperatureF = scanner.nextDouble();

        System.out.print("Enter your temperature C: ");
        double temperatureC = scanner.nextDouble();

        double temperatureCConvert = (temperatureF - 32) * 5 / 9;//C = (F - 32)*5/9
        double temperatureFConvert = temperatureC * 9 / 5 + 32;//F = C * 9 / 5 + 32 

        System.out.printf("sid: %s, Today is %d/%d\n", sid, month, day);
        System.out.printf("  >>Temperature %.2f°F is %.1f°C\n", temperatureF, temperatureCConvert);
        System.out.printf("  >>Temperature %.2f°C is %.2f°F\n", temperatureC, temperatureFConvert);
        scanner.close();
    }
}
