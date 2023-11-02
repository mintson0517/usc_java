package HW;

import java.util.Scanner;

public class HW_002_Scanner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("あなたの成績表を作成します");
        System.out.print("学籍番号を入力してください: ");
        String sid = scanner.next();

        System.out.print("国語の成績を入力してください: ");
        int a1 = scanner.nextInt();

        System.out.print("英語の成績を入力してください: ");
        int a2 = scanner.nextInt();

        System.out.print("数学の成績を入力してください: ");
        int a3 = scanner.nextInt();

        double average = (a1 + a2 + a3) / 3.0;

        //use println
        System.out.println("My sid: " + sid);
        System.out.println("国語の成績: " + a1);
        System.out.println("英語の成績: " + a2);
        System.out.println("数学の成績: " + a3);
        System.out.printf("平均成績:%.1f\n\n", average);//%.1f　小数点１；%.2f 小数点２

        //use printf
        System.out.printf("My sid:%s \n 国語の成績:%d \n英語の成績:%d \n 数学の成績:%d \n 平均成績:%.1f \n", sid, a1, a2, a3, average);

        scanner.close();
    }
}
