import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текущий курс доллара: ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("Введите количество рублей: ");
        double rubles = scanner.nextDouble();
        double dollars = rubles / exchangeRate;
        double roundedDollars = Math.round(dollars * 100.0) / 100.0;

        System.out.printf("Итого: %.2f долларов\n", roundedDollars);
        scanner.close();
    }
}
