package algorithmization.arrays;

import java.util.Scanner;

public class Arr2 {
  public static void main(String[] args) {
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите количество элементов массива");
    int n = scanner.nextInt();
    int[] a = new int[n];
    System.out.println("Введите число Z");
    int Z = scanner.nextInt();
    System.out.println("Задайте последовательность чисел:");
    for (int i = 0; i < a.length; i++) {
      a[i] = scanner.nextInt();
      if (a[i] > Z) {
        a[i] = Z;
        count++;
      }
    }

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    System.out.println("Количество замен: " + count);
  }
}

