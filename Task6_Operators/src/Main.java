import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();

        if (choice == 1) {
            convertMass(scanner);
        } else if (choice == 2) {
            convertDistance(scanner);
        } else {
            System.out.println("Неверный выбор. Попробуйте еще раз.");
        }

        scanner.close();
    }

    private static void convertMass(Scanner scanner) {
        System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - фунт, 4 - унция");
        int unit = scanner.nextInt();

        System.out.println("Введите число");
        double amount = scanner.nextDouble();

        switch (unit) {
            case 1: // килограмм
                System.out.printf("Килограммы: %.2f%n", amount);
                System.out.printf("Граммы: %.2f%n", amount * 1000);
                System.out.printf("Фунты: %.2f%n", amount * 2.20462);
                System.out.printf("Унции: %.2f%n", amount * 35.274);
                break;
            case 2: // грамм
                System.out.printf("Килограммы: %.2f%n", amount / 1000);
                System.out.printf("Граммы: %.2f%n", amount);
                System.out.printf("Фунты: %.2f%n", amount * 0.00220462);
                System.out.printf("Унции: %.2f%n", amount * 0.035274);
                break;
            case 3: // фунт
                System.out.printf("Килограммы: %.2f%n", amount * 0.453592);
                System.out.printf("Граммы: %.2f%n", amount * 453.592);
                System.out.printf("Фунты: %.2f%n", amount);
                System.out.printf("Унции: %.2f%n", amount * 16);
                break;
            case 4: // унция
                System.out.printf("Килограммы: %.2f%n", amount * 0.0283495);
                System.out.printf("Граммы: %.2f%n", amount * 28.3495);
                System.out.printf("Фунты: %.2f%n", amount * 0.0625);
                System.out.printf("Унции: %.2f%n", amount);
                break;
            default:
                System.out.println("Неверный выбор единицы измерения.");
        }
    }

    private static void convertDistance(Scanner scanner) {
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int unit = scanner.nextInt();

        System.out.println("Введите число");
        double amount = scanner.nextDouble();

        switch (unit) {
            case 1: // метр
                System.out.printf("Метры: %.2f%n", amount);
                System.out.printf("Мили: %.6f%n", amount * 0.000621371);
                System.out.printf("Ярды: %.2f%n", amount * 1.09361);
                System.out.printf("Футы: %.2f%n", amount * 3.28084);
                break;
            case 2: // миля
                System.out.printf("Метры: %.2f%n", amount * 1609.34);
                System.out.printf("Мили: %.2f%n", amount);
                System.out.printf("Ярды: %.2f%n", amount * 1760);
                System.out.printf("Футы: %.2f%n", amount * 5280);
                break;
            case 3: // ярд
                System.out.printf("Метры: %.2f%n", amount * 0.9144);
                System.out.printf("Мили: %.6f%n", amount * 0.000568182);
                System.out.printf("Ярды: %.2f%n", amount);
                System.out.printf("Футы: %.2f%n", amount * 3);
                break;
            case 4: // фут
                System.out.printf("Метры: %.2f%n", amount * 0.3048);
                System.out.printf("Мили: %.6f%n", amount * 0.000189394);
                System.out.printf("Ярды: %.2f%n", amount * 0.333333);
                System.out.printf("Футы: %.2f%n", amount);
                break;
            default:
                System.out.println("Неверный выбор единицы измерения.");
        }
    }
}
