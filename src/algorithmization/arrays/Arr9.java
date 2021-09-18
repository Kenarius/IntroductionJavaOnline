import java.util.Scanner;

public class Arr9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Введите числа");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[i]++;
                }
            }
        }
        int maxCount = b[0];
        int maxCountEl = a[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] > maxCount) {
                maxCount = b[i];
                maxCountEl = a[i];
            }
            if ((maxCount == b[i]) && (a[i] < maxCountEl)) {
                maxCountEl = a[i];
            }
        }
        System.out.println("Максимальное число повторений (" + maxCount + ") у числа " + maxCountEl);
    }
}














 /* count = 0;
          for (int j = 0; j < a.length; j++) {
        if (a[i] == a[j]) {
        count++;
        }
        }
        if (maxCount < count) {
        maxCount = count;
        number = i;
        }
      }

  */