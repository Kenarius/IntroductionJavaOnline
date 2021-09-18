package algorithmization.arrays;

import java.util.Scanner;

public class Arr1 {
  public static void main(String[] args) {
    int sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите количество элементов массива");
    int N = scanner.nextInt();
    int[] A = new int[N];
    System.out.println("Введите число K");
    int K = scanner.nextInt();
    System.out.println("Введите элементы массива:");
    for (int i = 0; i < A.length; i++) {
      A[i] = scanner.nextInt();
      if (A[i] % K == 0) {
        sum += A[i];
      }
    }
    if (sum == 0) {
      System.out.println("В массиве нет элементов, кратных числу K");
    } else {
      System.out.println("Сумма элементов, кратных числу K равна " + sum);
    }
  }
}
