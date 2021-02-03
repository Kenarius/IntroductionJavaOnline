package basicsOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

public class Cycles_1 {
  public static void main(String[] args) {
    int sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число");
    int input = scanner.nextInt();
    if (input > 0) {
      for (int i = 1; i <= input; i++) {
        sum += i;
      }
      System.out.println("Сумма равна " + sum);
    } else {
      System.out.println("Введено отрицательное число либо 0");
    }
  }
}
