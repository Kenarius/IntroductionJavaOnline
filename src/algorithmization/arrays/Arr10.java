import java.util.Scanner;

public class Arr10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int zeros = 0;
        for (int i = 1; i+1+y < arr.length;) {
                arr[i+x] = arr[i+1+y];
                x = x + 1;
                y = y + 2;
                zeros++;
        }
        if (arr.length%2==0){
            zeros++;
        }
        for (int i = arr.length-1; zeros > 0; i--,zeros--){
            arr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
