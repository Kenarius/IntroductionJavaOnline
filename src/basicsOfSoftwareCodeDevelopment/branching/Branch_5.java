package basicsOfSoftwareCodeDevelopment.branching;

import java.util.Scanner;

public class Branch_5 {
  public static void main(String[] args) {
    double F;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите x");
    double x = scanner.nextInt();
    if (x <= 3) {
      F = x * x - 3 * x + 9;
    } else {
      F = 1 / (x * x * x + 6);
    }
    System.out.println("Значение функции F: " + F);
  }
}
