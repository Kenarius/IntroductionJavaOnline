package basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class LP_6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите координату x");
    int x = scanner.nextInt();
    System.out.println("Введите координату y");
    int y = scanner.nextInt();
    if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
      System.out.println("true");
    } else {
      System.out.printf("false");
    }
  }
}
