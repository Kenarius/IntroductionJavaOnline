import java.util.Scanner;

import static java.lang.Math.sin;

public class mulArr7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и стобцов матрицы (чётное)");
        int N = scanner.nextInt();
        double[][] arr = new double[N][N];
        int count = 0;
        System.out.println("Искомая матрица:");
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sin((i * i - j * j) / N);
                    System.out.printf(arr[i][j] + " ");
                    if (arr[i][j]>=0){
                        count++;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Количество положительных элементов: "+count);
    }
}