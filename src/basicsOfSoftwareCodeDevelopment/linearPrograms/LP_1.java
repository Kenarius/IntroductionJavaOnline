package basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class LP_1 {
  public static void main(String[] args) {
    double z;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите a");
    double a = scanner.nextDouble();
    System.out.println("Введите b");
    double b = scanner.nextDouble();
    System.out.println("Введите c");
    double c = scanner.nextDouble();
    z = ((a - 3) * b / 2) + c;
    System.out.println("z = " + z);
  }
}
