import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i=0; i<array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int tmp = array[array.length-1];
        array[array.length-1] = array[0];
        array[0] = tmp;
        System.out.println(Arrays.toString(array));
    }
}