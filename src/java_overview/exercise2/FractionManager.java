package java_overview.exercise2;

public class FractionManager {

  public static void main(String[] args) {
    Fraction fraction_1 = new Fraction();
    Fraction fraction_2 = new Fraction();

    System.out.println("Nhap phan so thu nhat");
    fraction_1.input();

    System.out.println("Nhap phan so thu hai");
    fraction_2.input();

    System.out.print("Phan so thu nhat: ");
    fraction_1.output();

    System.out.print("Phan so thu hai: ");
    fraction_2.output();

    System.out.print("Tong hai phan so: ");
    Fraction sum = fraction_1.sum(fraction_2);
    sum.output();

    System.out.print("Hieu hai phan so: ");
    Fraction subtract = fraction_1.subtract(fraction_2);
    subtract.output();

    System.out.print("Tich hai phan so: ");
    Fraction multiply = fraction_1.multiply(fraction_2);
    multiply.output();

    System.out.print("Thuong hai phan so: ");
    Fraction divide = fraction_1.divide(fraction_2);
    divide.output();

    System.out.println("Phan so thu nhat la phan so " +(fraction_1.isPositiveFraction() ? "Duong" : "Am") + ".");

    System.out.println("Phan so thu hai la phan so " +(fraction_2.isPositiveFraction() ? "Duong" : "Am") + ".");

    System.out.println("Phan so thu nhat " + (fraction_1.isZeroFraction() ? "= 0" : "!= 0") + ".");

    System.out.println("Phan so thu hai " + (fraction_2.isZeroFraction() ? "= 0" : "!= 0") + ".");
  }
}
