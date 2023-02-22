import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a word to be reversed: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String reversing_word = new StringBuffer(input).reverse().toString();
        System.out.println(reversing_word);
    }
}