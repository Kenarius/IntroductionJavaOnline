import java.util.Scanner;

public class Arr3 {
    public static void main(String[] args) {
        int negative = 0, positive = 0, nulls = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int N = scanner.nextInt();
        double[] arr = new double[N];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
            if (arr[i] < 0) {
                negative++;
            }
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] == 0) {
                nulls++;
            }
        }
        System.out.println("Количество отрицительных элементво равно " + negative + ", количество положительных элементов равно " + positive + ", количество нулевых элементов равно " + nulls);
    }
}
