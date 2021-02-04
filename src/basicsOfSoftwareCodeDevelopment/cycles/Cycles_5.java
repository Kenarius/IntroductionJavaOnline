package basicsOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

import static java.lang.Math.*;

public class Cycles_5 {
  public static void main(String[] args) {
    double sum = 0, q;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите количество чисел в ряду");
    int n = scanner.nextInt();
    System.out.println("Введите число e");
    double e = scanner.nextDouble();
    for (int i = 1; i <= n; i++) {
      q = 1 / pow(2, i) + 1 / pow(3, i);
      if (abs(q) >= e) {
        sum += q;
      }
    }
    System.out.printf("Сумма членов ряда, модуль которых больше или равен "+e+" равна "+sum);
  }
}
