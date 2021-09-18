import java.util.Scanner;

public class mulArr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и стобцов матрицы (чётное)");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Искомая матрица:");
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                for (int j = 0, x = n; j < arr[i].length; j++, x--) {
                    arr[i][j] = x;
                    System.out.printf(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = j + 1;
                    System.out.printf(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}