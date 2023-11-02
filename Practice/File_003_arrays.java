package Practice;

import java.util.Random;
import java.util.Arrays;

public class File_003_arrays {
    public static void main(String[] argv) {
        Random random = new Random();
        int[] numbers = new int[10];

        System.out.print("ランダムに生成：\n");
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(71) + 30;
            System.out.printf("%d ", numbers[i]);
        }

        Arrays.sort(numbers);
        System.out.println("\n\n大から小に分類:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n\n小さい順にソートした数値:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
