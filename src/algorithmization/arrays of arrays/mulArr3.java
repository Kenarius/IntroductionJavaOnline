import java.util.Scanner;

public class mulArr3 {
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
        System.out.println("Введите строку, которую хотели бы вывести");
        int k = scanner.nextInt();
        System.out.println("Элементы вашей строки:");
        for (int i = 0; i < arr[k - 1].length; i++) {
            System.out.println(arr[k - 1][i]);
        }
        System.out.println("Введите столбец, который хотели бы вывести");
        int p = scanner.nextInt();
        System.out.println("Элементы вашего столбца:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][p - 1]);
        }
    }
}