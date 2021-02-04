package basicsOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

public class Cycles_2 {
  public static void main(String[] args) {
    double y;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите начало диапозона a");
    int a = scanner.nextInt();
    System.out.println("Введите конец диапозона b");
    int b = scanner.nextInt();
    System.out.println("Введите шаг изменения h");
    double h = scanner.nextDouble();
    for (double x = a; x <= b; x += h) {
      if (x > 2) {
        y = x;
      } else {
        y = -x;
      }
      System.out.println("x = " + x + "   y = " + y);
    }
  }
}
