import java.util.Scanner;

public class mulArr8 {
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
        System.out.println("Введите столбец 1");
        int column1 = scanner.nextInt();
        System.out.println("Введите столбец 2");
        int column2 = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i][column1 - 1];
            arr[i][column1 - 1] = arr[i][column2 - 1];
            arr[i][column2 - 1] = temp;
        }
        System.out.println("Новая матрица:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}