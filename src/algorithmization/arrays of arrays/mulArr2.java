import java.util.Scanner;

public class mulArr2 {
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
        System.out.println("Элементы главной диагонали:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);
        }
        System.out.println("Элементы побочной диагонали:");
        for(int i = 0, j = x-1;i<arr.length; i++,j--){
            System.out.println(arr[i][j]);
        }
    }
}
