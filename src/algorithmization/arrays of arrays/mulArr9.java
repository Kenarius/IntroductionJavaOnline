import java.util.Scanner;

public class mulArr9 {
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
        int maxSum = 0;
        int maxSumCol = 0;
        for (int j = 0; j < arr[0].length; j++ ){
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum += arr[i][j];
            }
            System.out.println("Сумма элементво в "+(j+1)+" столбце равна "+sum);
            if (sum>maxSum){
                maxSum = sum;
                maxSumCol = j+1;
            }
        }
        for (int j = 0; j < arr[0].length; j++ ){         //Для того, чтобы в случае наличия максимальной суммы у нескольких столбцов, выводились все столбцы
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum += arr[i][j];
            }
            if (sum==maxSum){
                System.out.println("Максимальная сумма ("+maxSum+") у столбца номер "+(j+1));
            }
        }
    }
}