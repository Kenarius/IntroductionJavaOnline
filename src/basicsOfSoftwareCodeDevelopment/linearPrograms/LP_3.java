package basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

import static java.lang.Math.*;

public class LP_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите x");
    double x = scanner.nextDouble();
    System.out.println("Введите y");
    double y = scanner.nextDouble();
    double z = tan(x * y) * (sin(x) + cos(y)) / (cos(x) - sin(y));
    System.out.println("Значение выражения = " + z);
  }
}
