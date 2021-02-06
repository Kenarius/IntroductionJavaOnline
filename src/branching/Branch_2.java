package branching;

import java.util.Scanner;

import static java.lang.Math.*;

public class Branch_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите a");
    int a = scanner.nextInt();
    System.out.println("Введите b");
    int b = scanner.nextInt();
    System.out.println("Введите c");
    int c = scanner.nextInt();
    System.out.println("Введите d");
    int d = scanner.nextInt();
    int min_1 = min(a, b);
    int min_2 = min(c, d);
    int max = max(min_1, min_2);
    System.out.println("max{min(a, b), min(c, d)} = " + max);
  }
}
