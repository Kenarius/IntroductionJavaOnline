import java.util.Scanner;

public class mulArr6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и стобцов матрицы (чётное)");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0) || (arr.length / (i + 1) >= 2)) {
                for (int j = 0; j < arr[i].length - i - i; j++) {
                    arr[i][j + i] = 1;
                }
            } else {
                for (int j = 0; j < arr[i].length - i - i + x + x; j++) {
                    arr[i][j + i - x] = 1;
                }
                x = x + 2;
            }
        }
        System.out.println("Искомая матрица:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
