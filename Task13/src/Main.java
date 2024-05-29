import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        int latinWordsCount = 0;

        System.out.println("Слова, состоящие только из латиницы:");

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                latinWordsCount++;
            }
        }
        System.out.println("Количество слов, состоящих только из латиницы: " + latinWordsCount);
        scanner.close();
    }
}
