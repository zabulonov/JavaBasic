import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        
        int maxAbs = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю значение: " + maxAbs);
    }
}
