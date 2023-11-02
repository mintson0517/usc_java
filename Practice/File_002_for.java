package Practice;

import java.util.Scanner;

public class File_002_for {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range of loop(integer 500~1000):");
        int input = scanner.nextInt();
        int even = 0;
        int odd = 0;
        int total = 0;

        for (int i = 1; i <= input; i++) {
            if ((i % 2 == 0) && (i % 7 == 0 || i % 22 == 0)) {
                odd++;
                total++;
                System.out.print(i + " ");
                if (total % 10 == 0) {
                    System.out.println();
                }
            } else if ((i % 2 != 0) && (i % 7 == 0 || i % 22 == 0)) {
                even++;
                total++;
                System.out.print(i + " ");
                if (total % 10 == 0) {
                    System.out.println();
                }
            }

            if (i > 699) {
                break;
            }
        }

        System.out.println("\nCount of Even:" + even + "Count of Odd:" + odd + "Total count:" + total);
        scanner.close();
    }
}