import java.util.Scanner;

public class mulArr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и стобцов матрицы (чётное)");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++) {
                arr[i][j] = i + 1;
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