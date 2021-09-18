import java.util.Scanner;

public class mulArr12 {
    public static void main(String[] args) {
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Введите элементы матрицы");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Элемент[" + (i + 1) + "][" + (j + 1) + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Исходная матрица:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Та же матрица, с отсортированными строками (по возрастанию)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int min = j;
                for (int k = j; k < arr[i].length; k++) {
                    if (arr[i][k] <= arr[i][min]) {
                        min = k;
                    }
                }
                temp = arr[i][j];
                arr[i][j] = arr[i][min];
                arr[i][min] = temp;
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Та же матрица, с отсортированными строками (по убыванию)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int max = j;
                for (int k = j; k < arr[i].length; k++) {
                    if (arr[i][k] >= arr[i][max]) {
                        max = k;
                    }
                }
                temp = arr[i][j];
                arr[i][j] = arr[i][max];
                arr[i][max] = temp;
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}