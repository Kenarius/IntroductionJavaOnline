import java.util.Scanner;

public class Arr7 {
    public static void main(String[] args) {
        double max = 0;
        int x = 0, y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        double[] a = new double[n];
        System.out.println("Введите числа");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextDouble();
        }
        max = a[0] + a[n - 1];
        for (int i = 0, j = 0; i < a.length; i++, j++) {
            if ((a[i] + a[n - 1 - j]) > max) {
                max = a[i] + a[n - 1 - j];
                x = i + 1;
                y = n - j;
            }
        }
        System.out.println("Максимум: a[" + x + "] + a[" + y + "] = " + max);
    }
}