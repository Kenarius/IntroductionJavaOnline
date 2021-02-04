package basicsOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

public class Cycles_7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите начало диапозона чисел");
    int m = scanner.nextInt();
    System.out.println("Введите конец диапозона чисел");
    int n = scanner.nextInt();
    for (int i = m; i <= n; i++) {
      System.out.printf("Все делители числа " + i + ": ");
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          System.out.printf(j + ", ");
        }
      }
      System.out.println("");
    }
  }
}
