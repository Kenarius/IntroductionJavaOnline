package basicsOfSoftwareCodeDevelopment.cycles;

public class Cycles_3 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i * i;
    }
    System.out.println("Сумма квадратов первых ста чисел равна " + sum);
  }
}
