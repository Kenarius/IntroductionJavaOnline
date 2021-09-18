import java.util.Scanner;

public class Arr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Введите числа");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Числа, значения которых больше их порядкового номера:");
        for (int i = 0; i < a.length; i++){
            if(a[i]>i+1){
                System.out.println("a["+(i+1)+"] = "+a[i]);
            }
        }
    }
}