package basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class LP_5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите время (в секундах)");
    int time = scanner.nextInt();
    int hours = time / 3600;
    int min = (time - hours * 3600) / 60;
    int sec = (time - hours * 3600 - min * 60);
    System.out.printf(hours + "ч " + min + "мин " + sec + "с");
  }
}
