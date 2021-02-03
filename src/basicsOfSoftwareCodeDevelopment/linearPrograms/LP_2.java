package basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LP_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите a");
    double a = scanner.nextDouble();
    System.out.println("Введите b");
    double b = scanner.nextDouble();
    System.out.println("Введите c");
    double c = scanner.nextDouble();
    double d = ((b + sqrt(b * b + 4 * a * c)) / (2 * a)) - a * a * a * c + 1 / b * b;
    System.out.println("Значение выражения = " + d);
  }
}
