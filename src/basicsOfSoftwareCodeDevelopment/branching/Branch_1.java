package basicsOfSoftwareCodeDevelopment.branching;

import java.util.Scanner;

public class Branch_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите угол a");
    int a = scanner.nextInt();
    System.out.println("Введите угол b");
    int b = scanner.nextInt();
    if ((a + b < 180) && a > 0 && b > 0) {
      System.out.println("Да, такой треугольник существует");
      if (a == 90 || b == 90 || 180 - a - b == 90) {
        System.out.printf("Данный треугольник будет прямоугольным");
      } else {
        System.out.printf("Данный треугольник не будет прямоугольным");
      }
    } else {
      System.out.printf("Нет, такого треугольника существовать не может");
    }
  }
}
