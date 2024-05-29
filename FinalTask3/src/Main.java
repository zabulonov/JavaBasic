import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        String maxUniqueCharsString = "";
        int maxUniqueCharsCount = 0;

        for (String str : strings) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : str.toCharArray()) {
                uniqueChars.add(c);
            }

            if (uniqueChars.size() > maxUniqueCharsCount) {
                maxUniqueCharsCount = uniqueChars.size();
                maxUniqueCharsString = str;
            }
        }
        System.out.println("Ответ: " + maxUniqueCharsString);
        scanner.close();
    }
}
