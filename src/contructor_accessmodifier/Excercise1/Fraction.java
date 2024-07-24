package contructor_accessmodifier.Excercise1;

public class Fraction {
  private int numerator;
  private int denominator;

  public Fraction() {

  }

  public Fraction(int numerator) {
    this.numerator = numerator;
    this.denominator = 1;
  }

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
    shortenFractions();
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
    if (denominator == 1) {
      System.out.println(numerator);
    } else {
      System.out.println(numerator + "/" + denominator);
    }
  }

  public Fraction copyFraction() {
    return new Fraction(numerator, denominator);
  }

  public void sum(int value) {
    numerator += value * denominator;
    shortenFractions();
  }

}
