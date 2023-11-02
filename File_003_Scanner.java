import java.util.Scanner;

public class File_003_Scanner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください:");
        int a = scanner.nextInt();

        System.out.print("文字列を入力してください：");
        String b = scanner.next();// String 文字列

        System.out.print("年齢を入力してください：");
        int age = scanner.nextInt();// int 整数

        System.out.print("身長を入力してください：");
        double height = scanner.nextDouble();// double 小数点数

        System.out.println("整数:" + a);
        System.out.println("文字:" + b);
        System.out.println("年齢は" + age + "歳");
        System.out.println("身長は" + height + "cm");

        scanner.close();
    }
}
