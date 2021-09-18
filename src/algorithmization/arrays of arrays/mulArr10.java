import java.util.Scanner;

public class mulArr10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и стобцов матрицы");
        int x = scanner.nextInt();
        int[][] arr = new int[x][x];
        System.out.println("Введите элементы матрицы");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Элемент[" + (i + 1) + "][" + (j + 1) + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Положительные элементы главной диагонали:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] >= 0) {
                System.out.println("Элемент[" + (i + 1) + "][" + (i + 1) + "] = " + arr[i][i]);
            }
        }
    }
}