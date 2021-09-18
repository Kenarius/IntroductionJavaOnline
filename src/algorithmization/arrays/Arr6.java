import java.util.Scanner;

public class Arr6 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int N = scanner.nextInt();
        double[] arr = new double[N];
        System.out.println("Введите числа");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
            int count = 0;
            for (int j = 1; j <= i + 1; j++) {
                if ((i + 1) % j == 0)
                    count++;
            }
            if (count == 2) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов, порядковым номер которых являются простые числа равна " + sum);
    }
}