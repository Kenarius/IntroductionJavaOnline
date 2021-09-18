import java.util.Scanner;

public class Arr4 {
    public static void main(String[] args) {
        int max = 0, min = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int N = scanner.nextInt();
        double[] a = new double[N];
        System.out.println("Введите числа");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextDouble();
            if (a[i] > a[max]) {
                max = i;
            }
            if (a[i] < a[min]) {
                min = i;
            }
        }
        double reserveMin = a[min];
        a[min] = a[max];
        a[max] = reserveMin;
        System.out.println("Конечный ряд чисел:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}