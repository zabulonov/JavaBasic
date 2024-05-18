import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
            double[] arr = new double[3];
            double sum = 0;
            for(int i=0; i < arr.length; i++)
            {
                arr[i] = console.nextDouble();
                sum += arr[i];
        }
            System.out.println(sum/ arr.length);
            double a = Math.floor((sum / arr.length)/2);

            if (a > 3)
                System.out.println("Программа выполнена корректно");
    }
}