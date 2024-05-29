import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение (длиной 5 символов): ");
        String equation = scanner.nextLine();

        if (equation.length() != 5 || (equation.charAt(1) != '+' && equation.charAt(1) != '-') || equation.charAt(3) != '=') {
            System.out.println("Некорректный формат уравнения.");
            return;
        }

        char op = equation.charAt(1);
        int a = Character.isDigit(equation.charAt(0)) ? Character.getNumericValue(equation.charAt(0)) : Integer.MIN_VALUE;
        int b = Character.isDigit(equation.charAt(2)) ? Character.getNumericValue(equation.charAt(2)) : Integer.MIN_VALUE;
        int c = Character.isDigit(equation.charAt(4)) ? Character.getNumericValue(equation.charAt(4)) : Integer.MIN_VALUE;

        int x = 0;

        if (a == Integer.MIN_VALUE) {
            // x +/- b = c
            if (op == '+') {
                x = c - b;
            } else {
                x = c + b;
            }
        } else if (b == Integer.MIN_VALUE) {
            // a +/- x = c
            if (op == '+') {
                x = c - a;
            } else {
                x = a - c;
            }
        } else if (c == Integer.MIN_VALUE) {
            // a +/- b = x
            if (op == '+') {
                x = a + b;
            } else {
                x = a - b;
            }
        }
        System.out.println("Значение x: " + x);
        scanner.close();
    }
}
