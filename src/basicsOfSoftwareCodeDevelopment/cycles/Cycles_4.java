package basicsOfSoftwareCodeDevelopment.cycles;

import java.math.BigInteger;

public class Cycles_4 {
  public static void main(String[] args) {
    BigInteger product = BigInteger.valueOf(1);
    for (int i = 1; i <= 200; i++) {
      product = product.multiply(BigInteger.valueOf(i * i));
    }
    System.out.println("Произведение квадратов первых двухсот чисел равно " + product);
  }
}
