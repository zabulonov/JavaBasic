import java.util.Scanner;

public class Main {
    private static final int X = 5;
    private static final int Y = 10;
    private static final int Z = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean containsConstant = false;
        for (int element : array) {
            if (element == X || element == Y || element == Z) {
                containsConstant = true;
                break;
            }
        }

        if (containsConstant) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Значения в константах не найдены");
        }

        scanner.close();
    }
}
