package basicsOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

public class Cycles_8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое число");
    String number1 = scanner.nextLine();
    System.out.println("Введите второе число");
    String number2 = scanner.nextLine();
    char[] nubmers1 = number1.toCharArray();
    System.out.println("Цифры, входящие в первое число:");
    for (char el : nubmers1) {
      System.out.println(el);
    }
    System.out.println("Цифры, входящие во второе число:");
    char[] nubmers2 = number2.toCharArray();
    for (char el : nubmers2) {
      System.out.println(el);
    }
  }
}
