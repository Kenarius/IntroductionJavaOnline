package branching;

import java.util.Scanner;

public class Branch_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите x_1");
    double x_1 = scanner.nextDouble();
    System.out.println("Введите y_1");
    double y_1 = scanner.nextDouble();
    System.out.println("Введите x_2");
    double x_2 = scanner.nextDouble();
    System.out.println("Введите y_2");
    double y_2 = scanner.nextDouble();
    System.out.println("Введите x_3");
    double x_3 = scanner.nextDouble();
    System.out.println("Введите y_3");
    double y_3 = scanner.nextDouble();
    if (((x_1 * y_2 + x_2 * y_3 + x_3 * y_1) - (x_2 * y_1 + x_3 * y_2 + x_1 * y_3)) / 2
        == 0) { // Формула коллинеарности точек
      System.out.println("Точки лежат на одной прямой");
    } else {
      System.out.println("Точки не лежат на одной прямой");
    }
  }
}
