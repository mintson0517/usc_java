package HW;

public class HW_006_char {
    public static void main(String args[]) {
        char[] text = {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'i', 'o', 'n', '-', 'm', 'a', 'n', 'a', 'g', 'e', 'm', 'e', 'n', 't'};

        System.out.print("Before: \n");
        for (char word : text) {
            System.out.printf("%c ", word);
        }
        System.out.println();

        System.out.println("\nAfter");
        for (int i = text.length - 1; i >= 0; i--) {
            System.out.printf("%c ", text[i]);
        }
    }
}
