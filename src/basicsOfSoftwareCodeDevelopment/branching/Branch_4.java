package basicsOfSoftwareCodeDevelopment.branching;

import java.util.Scanner;

public class Branch_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите длину отверстия");
    int A = scanner.nextInt();
    System.out.println("Введите ширину отверстия");
    int B = scanner.nextInt();
    System.out.println("Введите длину кирпича");
    int x = scanner.nextInt();
    System.out.println("Введите ширину кирпича");
    int y = scanner.nextInt();
    System.out.println("Введите высоту кирпича");
    int z = scanner.nextInt();
    if (((x <= A || x <= B) && (y <= A || y <= B))
        || ((x <= A || x <= B) && (z <= A || z <= B))
        || ((y <= A || y <= B) && (z <= A || z <= B))) {
      System.out.println("Кирпич пройдёт через данное отверстие.");
    } else {
      System.out.println("Кирпич не пройдёт через данное отверстие");
    }
  }
}
