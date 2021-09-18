import java.util.Scanner;

public class mulArr1 {
    public static void main(String[] args) {
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
        for (int j = 0; j < arr[0].length; j++) {
            if ((arr[0][j] > arr[arr.length - 1][j]) && ((j + 1) % 2 != 0)) {
                System.out.println("Нечётный столбец №" + (j + 1));
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
