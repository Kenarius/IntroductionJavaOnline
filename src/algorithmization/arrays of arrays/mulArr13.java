import java.util.Scanner;

public class mulArr13 {
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
        System.out.println("Та же матрица, с отсортированными столбцами (по возрастанию)");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                int min = i;
                for (int k = i; k < arr.length; k++) {
                    if (arr[k][j] <= arr[min][j]) {
                        min = k;
                    }
                }
                temp = arr[i][j];
                arr[i][j] = arr[min][j];
                arr[min][j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Та же матрица, с отсортированными столбцами (по убыванию)");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                int max = i;
                for (int k = i; k < arr.length; k++) {
                    if (arr[k][j] >= arr[max][j]) {
                        max = k;
                    }
                }
                temp = arr[i][j];
                arr[i][j] = arr[max][j];
                arr[max][j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}