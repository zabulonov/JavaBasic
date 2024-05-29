import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String answer = "Заархивированный вирус";
        String hint = "Это связано с компьютерами и безопасностью.";
        int attempts = 3;
        boolean hintUsed = false;

        System.out.println("Загадка: " + riddle);

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Ваш ответ: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase("Подсказка")) {
                if (i == 1) {
                    System.out.println("Подсказка: " + hint);
                    hintUsed = true;
                    break;
                } else {
                    System.out.println("Подсказка уже недоступна.");
                }
            } else if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                return;
            } else {
                if (i < attempts) {
                    System.out.println("Подумай еще!");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
        if (hintUsed) {
            System.out.print("Ваш ответ: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
        scanner.close();
    }
}
