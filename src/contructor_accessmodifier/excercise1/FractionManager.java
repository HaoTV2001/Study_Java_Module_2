package contructor_accessmodifier.excercise1;

public class FractionManager {
  public static void main(String[] args) {
    Fraction fraction_1 = new Fraction();
    fraction_1.output();

    Fraction fraction_2 = new Fraction(1,2);
    fraction_2.output();

    Fraction fraction_3 = new Fraction(3);
    fraction_3.output();

    Fraction fraction_4 = new Fraction(-6, -2);
    fraction_4.output();

    Fraction fraction_5 = new Fraction(3, -1);
    fraction_5.output();

    Fraction fraction_6 = fraction_5.copyFraction();
    fraction_6.sum(100);
    fraction_5.output();
    fraction_6.output();

  }
}
