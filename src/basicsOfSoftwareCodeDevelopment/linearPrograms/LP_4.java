package basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

import static java.lang.Math.*;

public class LP_4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите действительное число R"); // число должно быть вида nnn.ddd
    double R = input.nextDouble();
    double fp = R - (floor(R));
    double number = fp * 1000 + floor(R) / 1000;
    String result =
        String.format(
            "%.3f", number); // так как после действия с числами типа double могу быть не точные
    System.out.println("Результат замены дробной и целой части местами: " + result);
  }
}
