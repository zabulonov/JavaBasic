import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Первая строка матрицы, умноженная на 3:");
        for (int j = 0; j < cols; j++) {
            System.out.print((matrix[0][j] * 3) + " ");
        }
        System.out.println();

        scanner.close();
    }
}
