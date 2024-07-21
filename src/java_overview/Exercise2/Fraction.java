package java_overview.Exercise2;

import java.util.Scanner;

public class Fraction {
  int numerator;
  int denominator;

  public void input() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Nhap tu so: ");
    numerator = Integer.parseInt(scan.nextLine());
    do {
      System.out.print("Nhap mau so (denominator != 0): ");
      denominator = Integer.parseInt(scan.nextLine());
    } while (denominator == 0);

  }

  public int greatestCommonDivisor(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public void shortenFractions() {
    int gcd = greatestCommonDivisor(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;

    if (denominator < 0) {
      numerator = -numerator;
      denominator = -denominator;
    }
  }

  public void output() {
    shortenFractions();
    if (denominator == 1) {
      System.out.println(numerator);
    } else {
      System.out.println(numerator + "/" + denominator);
    }
  }

  public Fraction sum(Fraction anotherFraction) {
    Fraction result = new Fraction();
    result.numerator = this.numerator * anotherFraction.denominator + anotherFraction.numerator * this.denominator;
    result.denominator = this.denominator * anotherFraction.denominator;
    result.shortenFractions();
    return result;
  }

  public Fraction subtract(Fraction anotherFraction) {
    Fraction result = new Fraction();
    result.numerator = this.numerator * anotherFraction.denominator - anotherFraction.numerator * this.denominator;
    result.denominator = this.denominator * anotherFraction.denominator;
    result.shortenFractions();
    return result;
  }

  public Fraction multiply(Fraction anotherFraction) {
    Fraction result = new Fraction();
    result.numerator = this.numerator * anotherFraction.numerator;
    result.denominator = this.denominator * anotherFraction.denominator;
    result.shortenFractions();
    return result;
  }

  public Fraction divide(Fraction anotherFraction) {
    Fraction result = new Fraction();
    result.numerator = this.numerator * anotherFraction.denominator;
    result.denominator = this.denominator * anotherFraction.numerator;
    result.shortenFractions();
    return result;
  }

  public boolean isPositiveFraction() {
    return numerator * denominator > 0 || numerator == 0;
  }

  public boolean isZeroFraction() {
    return numerator == 0;
  }

}
