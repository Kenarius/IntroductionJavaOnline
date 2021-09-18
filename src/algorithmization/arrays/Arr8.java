import java.util.Scanner;

public class Arr8 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Введите числа");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {                    // Для того, чтобы позже задать точный размер нового массива
            if (a[i] == min) {
                count++;
            }
        }
        int[] b = new int[n-count];
        System.out.println("Новая последовательность b: ");
        for (int i = 0, j = 0; i < n; i++){
            if (a[i]==min){
                j++;
                continue;
            }
            b[i-j]=a[i];
            System.out.println("b["+(i-j+1)+"] = "+b[i-j]);
        }
    }
}